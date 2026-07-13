# Apocalypse Now 3.0.5 — Reconstructed & Enhanced

[![Build](https://github.com/davdan229/apocalypse-now-reconstructed/actions/workflows/build.yml/badge.svg)](https://github.com/davdan229/apocalypse-now-reconstructed/actions/workflows/build.yml)

**English** | [Русский](README_RU.md)

An unofficial, maximally reconstructed and enhanced edition of **Apocalypse Now — Post Apocalyptic Arsenal** for Minecraft 1.20.1 Forge.

The original mod and all of its original content were created by **JPZamps**. This repository is not the author's official repository and does not present the reconstructed edition as an official release.

- [Original mod on CurseForge](https://www.curseforge.com/minecraft/mc-mods/apocalypse-now)
- [Original 3.0.5 release for Forge 1.20.1](https://www.curseforge.com/minecraft/mc-mods/apocalypse-now/files/6364603)
- [JPZamps on CurseForge](https://www.curseforge.com/members/jpzamps/projects)

## About this project

The project was reconstructed from the official `apocalypsenow-3.0.5-forge-1.20.1.jar` with official Mojang mappings. The original mod ID, version and content registry identifiers are preserved to maintain compatibility with existing worlds and modpacks based on version 3.0.5.

Technical baseline:

- Minecraft 1.20.1;
- Forge 47.4.10;
- Java 17;
- Curios 5.12.1+1.20.1;
- mod ID: `apocalypsenow`;
- mod version: `3.0.5`.

## Highlights

- tall and wide blocks behave as one object, with consistent collision, outline, interaction, breaking, required tool, sound and particles;
- corrected interaction areas for corpses, traps, barriers, furniture and other protruding models;
- Curios accessories can be equipped or swapped with right click;
- player skin overlay layers are hidden beneath matching armor pieces;
- corrected target selection, retaliation, melee reach, faction behavior and natural spawning for mobs;
- walkers, runners and hordes use the standard aggressive zombie-arm animation;
- corrected bite, infection and zombification behavior without accumulating thousands of delayed tasks;
- removed double execution, incorrect consumption and client/server desynchronization from medical items, fluids, books, radios, explosives and tools;
- corrected the chainsaw, can opener, fertilizer, pepper spray, bomb-defusing kit, grenades, barrels and rain collectors;
- corrected broken recipes and invalid model, texture, tag and loot references;
- reorganized creative tabs by purpose, family and item type;
- added a complete Russian translation covering all 1569 English keys;
- removed useless perpetual ticks and obsolete resources ignored by Forge.

See [CHANGELOG.md](CHANGELOG.md) for the detailed list.

## Optional mod compatibility

- **Better Combat 1.9.0+1.20.1:** dedicated weapon attributes cover 221 registered Apocalypse Now weapons. Invalid legacy mappings were corrected and previously omitted melee families were added.
- **Farmer's Delight 1.3.2:** all 41 Apocalypse Now knives are exposed through both the Forge and Farmer's Delight knife tags, so they are recognized by cutting-board recipes and the mod's standard knife-dependent interactions. Farmer's Delight knives also remain valid for Apocalypse Now recipes that accept `forge:tools/knives`.

Both integrations are optional; neither mod is required to run Apocalypse Now. When Better Combat is installed, install its required Player Animator and Cloth Config dependencies as usual. The combination above was verified on a Forge 47.4.10 dedicated server using Java 17.

## Installing the built JAR

1. Install Minecraft 1.20.1 and Forge 47.4.10.
2. Install Curios for Minecraft 1.20.1.
3. Remove the original Apocalypse Now 3.0.5 JAR from the `mods` directory.
4. Put `apocalypsenow-3.0.5-forge-1.20.1.jar` into the `mods` directory.
5. Do not install the original and reconstructed editions together: they share the same mod ID.

Back up an existing world before its first launch with this edition. Tall or wide furniture already placed in an old world should be broken and placed once so the new invisible interaction cells can be created.

## Building from source

A separate Forge MDK or Gradle installation is not required. The repository includes the Gradle Wrapper. The first build requires internet access to download Minecraft Forge, mappings and Curios.

### Windows

1. Install [JDK 17](https://adoptium.net/temurin/releases/?version=17). Install the **JDK**, not only a JRE.
2. Download the repository through **Code → Download ZIP** and extract it, or clone it with Git.
3. Open the project directory containing `gradlew.bat`.
4. On a supported Windows version, click the File Explorer address bar in the open project directory, enter `powershell`, and press Enter. Depending on the Windows version, the context menu may also provide **Open in Terminal** or **Open PowerShell window here**.
5. Paste this command into PowerShell:

```powershell
.\gradlew.bat clean build --no-daemon
```

Do not paste the command into Java source or another project file. It is a terminal command and must be run from the project root.

After a successful build, the mod will be located at:

```text
build\libs\apocalypsenow-3.0.5-forge-1.20.1.jar
```

If Java cannot be found, reopen the terminal after installing JDK 17 and check:

```powershell
java -version
```

The output must report Java 17.

### Linux and macOS

```bash
chmod +x gradlew
./gradlew clean build --no-daemon
```

The built JAR will be placed in `build/libs/`.

### IntelliJ IDEA

Open `build.gradle` as a Gradle project, select JDK 17 and allow Gradle to synchronize the dependencies. The regular `build` task or the Gradle Wrapper command above is sufficient to create the release JAR.

## Verification

Run the complete local verification with:

```powershell
.\gradlew.bat clean build --no-daemon
python .\tools\audit_mod.py
```

The audit validates registries, recipes, models, textures, language keys, menus, tags, loot tables and cross-resource references. GitHub Actions also builds the project for every push and pull request.

## Existing-world compatibility

The original `modid=apocalypsenow`, version `3.0.5`, and registry identifiers for blocks, items, entities, effects and menus are preserved. This edition is intended as a direct replacement for the original JAR in a Minecraft 1.20.1 Forge modpack.

For a dedicated server, install the same JAR on both the server and every client. To roll back after saving a world with this edition, restore both the backup world and the original JAR.

## License and attribution

The official 3.0.5 JAR declares `Academic Free License v3.0` in `META-INF/mods.toml`, while the CurseForge project page currently displays `All Rights Reserved`. This repository preserves the declaration embedded in the official JAR, complete original-author attribution, and a prominent notice that the work has been reconstructed and modified.

See [LICENSE](LICENSE) and [NOTICE.md](NOTICE.md). Rights to the original models, textures, sounds, name and other original content remain with their respective rightsholders. This project is not affiliated with Mojang Studios, Microsoft, Minecraft Forge or the original mod author.

## Reconstruction limits

The bytecode, resources, classes, fields, methods and available debug information have been recovered as completely as practical. The author's comments, original formatting and some local variable names were not present in the compiled JAR and cannot be restored verbatim.
