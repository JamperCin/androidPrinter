# androidPrinter
Easily print to hardware devices from an Android device using this light weight library
[![](https://jitpack.io/v/JamperCin/searchingspinner.svg)](https://jitpack.io/#JamperCin/androidPrinter)

**Step 1: Add this to your root build.gradle(Project level) at the end of repositories:**

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  **Step 2: Add the dependency to your dependencies in the build.gradle (Module:App level)**

	dependencies {
	       compile 'com.github.JamperCin:androidPrinter:1.0.0'
	}
  
 

**and call it from the Activity like:**

```
  new AndroidPrinter(this).Builder(PrinterType.MOBI_WIRE_POS)
                          .printText("Hello world");
```
