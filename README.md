Demo openRawResource() Robolectric library bug
=======

Demo for [issue #1430](https://github.com/robolectric/robolectric/issues/1430) in Robolectric.

Note that I used [a somewhat hacky solution](https://gist.github.com/nolanlawson/fe5bfab1867d71000c81) in `settings.gradle` to link the `HelloRobolectricLibrary` to the `HelloRobolectricApp`, but I didn't want you to have to deal with Maven deploying or any of that stuff in order to reproduce.

To reproduce:

```bash
git clone https://github.com/nolanlawson/demo-robolectric-openrawresource.git
cd demo-robolectric-openrawresource
cd HelloRobolectric
./gradlew assemble
cd ../HelloRobolectricApp
./gradlew test
```