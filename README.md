# androidPrinter
Easily print to hardware devices from an Android device using this light weight library
[![](https://www.jitpack.io/v/JamperCin/androidPrinter.svg)](https://www.jitpack.io/#JamperCin/androidPrinter)

**Step 1: Add this to your root build.gradle(Project level) at the end of repositories:**

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  **Step 2: Add the dependency to your dependencies in the build.gradle (Module:App level)**

	dependencies {
	       compile 'com.github.JamperCin:androidPrinter:1.0.1'
	}
  
 

**and call it from the Activity like:**

```
  new AndroidPrinter(this).Builder(PrinterType.MOBI_WIRE_POS)
                          .printText("Hello world");
```

**Print Text and determine size of letter**
```
 new AndroidPrinter(this).Builder(PrinterType.MOBI_WIRE_POS)
 .printText("Hello world",4);

```
