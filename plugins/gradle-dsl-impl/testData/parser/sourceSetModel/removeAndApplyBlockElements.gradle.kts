android {
  sourceSets {
    getByName("main") {
      aidl {
        srcDir("aidlSource")
      }
      assets {
        srcDir("aseetsSource")
      }
      java {
        srcDir("javaSource")
      }
      jni {
        srcDir("jniSource")
      }
      jniLibs {
        srcDir("jniLibsSource")
      }
      manifest {
        srcFile("manifestSource.xml")
      }
      mlModels {
        srcDir("mlModelsSource")
      }
      renderscript {
        srcDir("renderscriptSource")
      }
      res {
        srcDir("resSource")
      }
      resources {
        srcDir("resourcesSource")
      }
      shaders {
        srcDir("shadersSource")
      }
    }
  }
}
