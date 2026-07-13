# Contributing

Contributions that fix reproducible defects, improve compatibility or complete missing behavior are welcome.

## Development requirements

- JDK 17;
- Minecraft 1.20.1;
- Forge 47.4.10;
- an internet connection for the first Gradle dependency download.

Import `build.gradle` into IntelliJ IDEA or Eclipse as a Gradle project. A separate Gradle installation is not required.

## Before submitting a change

1. Do not rename existing registry identifiers: save compatibility is protected behavior.
2. Keep gameplay changes scoped and explain how they differ from the official 3.0.5 release.
3. Run a clean build:

```bash
./gradlew clean build --no-daemon
```

4. Run the static audit:

```bash
python tools/audit_mod.py
```

5. For runtime or rendering changes, test both a newly created world and a copy of an existing world.

Bug reports should include the Minecraft, Forge and Curios versions, a minimal reproduction sequence and the relevant `latest.log`. Do not attach worlds or complete modpacks unless they are necessary and safe to share.
