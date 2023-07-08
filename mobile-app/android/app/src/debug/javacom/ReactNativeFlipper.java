{"payload":{"allShortcutsEnabled":true,"fileTree":{"mobile-app/android/app/src/debug/java/com/mldemo":{"items":[{"name":"ReactNativeFlipper.java","path":"mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java","contentType":"file"}],"totalCount":1},"mobile-app/android/app/src/debug/java/com":{"items":[{"name":"mldemo","path":"mobile-app/android/app/src/debug/java/com/mldemo","contentType":"directory"}],"totalCount":1},"mobile-app/android/app/src/debug/java":{"items":[{"name":"com","path":"mobile-app/android/app/src/debug/java/com","contentType":"directory"}],"totalCount":1},"mobile-app/android/app/src/debug":{"items":[{"name":"java","path":"mobile-app/android/app/src/debug/java","contentType":"directory"},{"name":"AndroidManifest.xml","path":"mobile-app/android/app/src/debug/AndroidManifest.xml","contentType":"file"}],"totalCount":2},"mobile-app/android/app/src":{"items":[{"name":"debug","path":"mobile-app/android/app/src/debug","contentType":"directory"},{"name":"main","path":"mobile-app/android/app/src/main","contentType":"directory"}],"totalCount":2},"mobile-app/android/app":{"items":[{"name":"src","path":"mobile-app/android/app/src","contentType":"directory"},{"name":"BUCK","path":"mobile-app/android/app/BUCK","contentType":"file"},{"name":"build.gradle","path":"mobile-app/android/app/build.gradle","contentType":"file"},{"name":"build_defs.bzl","path":"mobile-app/android/app/build_defs.bzl","contentType":"file"},{"name":"debug.keystore","path":"mobile-app/android/app/debug.keystore","contentType":"file"},{"name":"proguard-rules.pro","path":"mobile-app/android/app/proguard-rules.pro","contentType":"file"}],"totalCount":6},"mobile-app/android":{"items":[{"name":"app","path":"mobile-app/android/app","contentType":"directory"},{"name":"gradle","path":"mobile-app/android/gradle","contentType":"directory"},{"name":"build.gradle","path":"mobile-app/android/build.gradle","contentType":"file"},{"name":"gradle.properties","path":"mobile-app/android/gradle.properties","contentType":"file"},{"name":"gradlew","path":"mobile-app/android/gradlew","contentType":"file"},{"name":"gradlew.bat","path":"mobile-app/android/gradlew.bat","contentType":"file"},{"name":"settings.gradle","path":"mobile-app/android/settings.gradle","contentType":"file"}],"totalCount":7},"mobile-app":{"items":[{"name":"__tests__","path":"mobile-app/__tests__","contentType":"directory"},{"name":"android","path":"mobile-app/android","contentType":"directory"},{"name":"ios","path":"mobile-app/ios","contentType":"directory"},{"name":".buckconfig","path":"mobile-app/.buckconfig","contentType":"file"},{"name":".editorconfig","path":"mobile-app/.editorconfig","contentType":"file"},{"name":".env.example","path":"mobile-app/.env.example","contentType":"file"},{"name":".eslintrc.js","path":"mobile-app/.eslintrc.js","contentType":"file"},{"name":".flowconfig","path":"mobile-app/.flowconfig","contentType":"file"},{"name":".gitattributes","path":"mobile-app/.gitattributes","contentType":"file"},{"name":".gitignore","path":"mobile-app/.gitignore","contentType":"file"},{"name":".prettierrc.js","path":"mobile-app/.prettierrc.js","contentType":"file"},{"name":".watchmanconfig","path":"mobile-app/.watchmanconfig","contentType":"file"},{"name":"App.js","path":"mobile-app/App.js","contentType":"file"},{"name":"Permissions.js","path":"mobile-app/Permissions.js","contentType":"file"},{"name":"app.json","path":"mobile-app/app.json","contentType":"file"},{"name":"babel.config.js","path":"mobile-app/babel.config.js","contentType":"file"},{"name":"index.js","path":"mobile-app/index.js","contentType":"file"},{"name":"metro.config.js","path":"mobile-app/metro.config.js","contentType":"file"},{"name":"package.json","path":"mobile-app/package.json","contentType":"file"},{"name":"yarn.lock","path":"mobile-app/yarn.lock","contentType":"file"}],"totalCount":20},"":{"items":[{"name":"api","path":"api","contentType":"directory"},{"name":"frontend","path":"frontend","contentType":"directory"},{"name":"gcp","path":"gcp","contentType":"directory"},{"name":"mobile-app","path":"mobile-app","contentType":"directory"},{"name":"saved_models","path":"saved_models","contentType":"directory"},{"name":"test_images_from_internet","path":"test_images_from_internet","contentType":"directory"},{"name":"tf-lite-models","path":"tf-lite-models","contentType":"directory"},{"name":"training","path":"training","contentType":"directory"},{"name":".gcloudignore","path":".gcloudignore","contentType":"file"},{"name":".gitignore","path":".gitignore","contentType":"file"},{"name":"README.md","path":"README.md","contentType":"file"},{"name":"models.config.example","path":"models.config.example","contentType":"file"},{"name":"potatoes.h5","path":"potatoes.h5","contentType":"file"}],"totalCount":13}},"fileTreeProcessingTime":114.24835399999999,"foldersToFetch":[],"reducedMotionEnabled":"system","repo":{"id":381362679,"defaultBranch":"main","name":"potato-disease-classification","ownerLogin":"codebasics","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2021-06-29T18:18:39.000+05:30","ownerAvatar":"https://avatars.githubusercontent.com/u/16063416?v=4","public":true,"private":false,"isOrgOwned":true},"refInfo":{"name":"main","listCacheKey":"v0:1624970920.249391","canEdit":true,"refType":"branch","currentOid":"c1960a19cb6973f3b0778ae484f2b099b5d89df6"},"path":"mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java","currentUser":{"id":138309651,"login":"AlgoGenius422","userEmail":"officialamit558@gmail.com"},"blob":{"rawBlob":"/**\n * Copyright (c) Facebook, Inc. and its affiliates.\n *\n * <p>This source code is licensed under the MIT license found in the LICENSE file in the root\n * directory of this source tree.\n */\npackage com.mldemo;\n\nimport android.content.Context;\nimport com.facebook.flipper.android.AndroidFlipperClient;\nimport com.facebook.flipper.android.utils.FlipperUtils;\nimport com.facebook.flipper.core.FlipperClient;\nimport com.facebook.flipper.plugins.crashreporter.CrashReporterPlugin;\nimport com.facebook.flipper.plugins.databases.DatabasesFlipperPlugin;\nimport com.facebook.flipper.plugins.fresco.FrescoFlipperPlugin;\nimport com.facebook.flipper.plugins.inspector.DescriptorMapping;\nimport com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin;\nimport com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;\nimport com.facebook.flipper.plugins.network.NetworkFlipperPlugin;\nimport com.facebook.flipper.plugins.react.ReactFlipperPlugin;\nimport com.facebook.flipper.plugins.sharedpreferences.SharedPreferencesFlipperPlugin;\nimport com.facebook.react.ReactInstanceManager;\nimport com.facebook.react.bridge.ReactContext;\nimport com.facebook.react.modules.network.NetworkingModule;\nimport okhttp3.OkHttpClient;\n\npublic class ReactNativeFlipper {\n  public static void initializeFlipper(Context context, ReactInstanceManager reactInstanceManager) {\n    if (FlipperUtils.shouldEnableFlipper(context)) {\n      final FlipperClient client = AndroidFlipperClient.getInstance(context);\n\n      client.addPlugin(new InspectorFlipperPlugin(context, DescriptorMapping.withDefaults()));\n      client.addPlugin(new ReactFlipperPlugin());\n      client.addPlugin(new DatabasesFlipperPlugin(context));\n      client.addPlugin(new SharedPreferencesFlipperPlugin(context));\n      client.addPlugin(CrashReporterPlugin.getInstance());\n\n      NetworkFlipperPlugin networkFlipperPlugin = new NetworkFlipperPlugin();\n      NetworkingModule.setCustomClientBuilder(\n          new NetworkingModule.CustomClientBuilder() {\n            @Override\n            public void apply(OkHttpClient.Builder builder) {\n              builder.addNetworkInterceptor(new FlipperOkhttpInterceptor(networkFlipperPlugin));\n            }\n          });\n      client.addPlugin(networkFlipperPlugin);\n      client.start();\n\n      // Fresco Plugin needs to ensure that ImagePipelineFactory is initialized\n      // Hence we run if after all native modules have been initialized\n      ReactContext reactContext = reactInstanceManager.getCurrentReactContext();\n      if (reactContext == null) {\n        reactInstanceManager.addReactInstanceEventListener(\n            new ReactInstanceManager.ReactInstanceEventListener() {\n              @Override\n              public void onReactContextInitialized(ReactContext reactContext) {\n                reactInstanceManager.removeReactInstanceEventListener(this);\n                reactContext.runOnNativeModulesQueueThread(\n                    new Runnable() {\n                      @Override\n                      public void run() {\n                        client.addPlugin(new FrescoFlipperPlugin());\n                      }\n                    });\n              }\n            });\n      } else {\n        client.addPlugin(new FrescoFlipperPlugin());\n      }\n    }\n  }\n}\n","colorizedLines":null,"stylingDirectives":[[{"start":0,"end":3,"cssClass":"pl-c"}],[{"start":0,"end":51,"cssClass":"pl-c"}],[{"start":0,"end":2,"cssClass":"pl-c"}],[{"start":0,"end":94,"cssClass":"pl-c"}],[{"start":0,"end":33,"cssClass":"pl-c"}],[{"start":0,"end":3,"cssClass":"pl-c"}],[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":11,"cssClass":"pl-s1"},{"start":12,"end":18,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":14,"cssClass":"pl-s1"},{"start":15,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":56,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":41,"cssClass":"pl-s1"},{"start":42,"end":54,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":32,"cssClass":"pl-s1"},{"start":33,"end":46,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":49,"cssClass":"pl-s1"},{"start":50,"end":69,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":45,"cssClass":"pl-s1"},{"start":46,"end":68,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":42,"cssClass":"pl-s1"},{"start":43,"end":62,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":45,"cssClass":"pl-s1"},{"start":46,"end":63,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":45,"cssClass":"pl-s1"},{"start":46,"end":68,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":43,"cssClass":"pl-s1"},{"start":44,"end":68,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":43,"cssClass":"pl-s1"},{"start":44,"end":64,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":41,"cssClass":"pl-s1"},{"start":42,"end":60,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":27,"cssClass":"pl-s1"},{"start":28,"end":35,"cssClass":"pl-s1"},{"start":36,"end":53,"cssClass":"pl-s1"},{"start":54,"end":84,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":25,"cssClass":"pl-s1"},{"start":26,"end":46,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":25,"cssClass":"pl-s1"},{"start":26,"end":32,"cssClass":"pl-s1"},{"start":33,"end":45,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":10,"cssClass":"pl-s1"},{"start":11,"end":19,"cssClass":"pl-s1"},{"start":20,"end":25,"cssClass":"pl-s1"},{"start":26,"end":33,"cssClass":"pl-s1"},{"start":34,"end":41,"cssClass":"pl-s1"},{"start":42,"end":58,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":14,"cssClass":"pl-s1"},{"start":15,"end":27,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":31,"cssClass":"pl-smi"}],[{"start":2,"end":8,"cssClass":"pl-k"},{"start":9,"end":15,"cssClass":"pl-k"},{"start":16,"end":20,"cssClass":"pl-smi"},{"start":21,"end":38,"cssClass":"pl-en"},{"start":39,"end":46,"cssClass":"pl-smi"},{"start":47,"end":54,"cssClass":"pl-s1"},{"start":56,"end":76,"cssClass":"pl-smi"},{"start":77,"end":97,"cssClass":"pl-s1"}],[{"start":4,"end":6,"cssClass":"pl-k"},{"start":8,"end":20,"cssClass":"pl-smi"},{"start":21,"end":40,"cssClass":"pl-en"},{"start":41,"end":48,"cssClass":"pl-s1"}],[{"start":6,"end":11,"cssClass":"pl-k"},{"start":12,"end":25,"cssClass":"pl-smi"},{"start":26,"end":32,"cssClass":"pl-s1"},{"start":35,"end":55,"cssClass":"pl-smi"},{"start":56,"end":67,"cssClass":"pl-en"},{"start":68,"end":75,"cssClass":"pl-s1"}],[],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":49,"cssClass":"pl-smi"},{"start":50,"end":57,"cssClass":"pl-s1"},{"start":59,"end":76,"cssClass":"pl-smi"},{"start":77,"end":89,"cssClass":"pl-en"}],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":45,"cssClass":"pl-smi"}],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":49,"cssClass":"pl-smi"},{"start":50,"end":57,"cssClass":"pl-s1"}],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":26,"cssClass":"pl-k"},{"start":27,"end":57,"cssClass":"pl-smi"},{"start":58,"end":65,"cssClass":"pl-s1"}],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":42,"cssClass":"pl-smi"},{"start":43,"end":54,"cssClass":"pl-en"}],[],[{"start":6,"end":26,"cssClass":"pl-smi"},{"start":27,"end":47,"cssClass":"pl-s1"},{"start":50,"end":53,"cssClass":"pl-k"},{"start":54,"end":74,"cssClass":"pl-smi"}],[{"start":6,"end":22,"cssClass":"pl-smi"},{"start":23,"end":45,"cssClass":"pl-en"}],[{"start":10,"end":13,"cssClass":"pl-k"},{"start":14,"end":30,"cssClass":"pl-smi"},{"start":31,"end":50,"cssClass":"pl-smi"}],[{"start":12,"end":13,"cssClass":"pl-c1"},{"start":13,"end":21,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-k"},{"start":19,"end":23,"cssClass":"pl-smi"},{"start":24,"end":29,"cssClass":"pl-en"},{"start":30,"end":42,"cssClass":"pl-smi"},{"start":43,"end":50,"cssClass":"pl-smi"},{"start":51,"end":58,"cssClass":"pl-s1"}],[{"start":14,"end":21,"cssClass":"pl-s1"},{"start":22,"end":43,"cssClass":"pl-en"},{"start":44,"end":47,"cssClass":"pl-k"},{"start":48,"end":72,"cssClass":"pl-smi"},{"start":73,"end":93,"cssClass":"pl-s1"}],[],[],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":22,"cssClass":"pl-en"},{"start":23,"end":43,"cssClass":"pl-s1"}],[{"start":6,"end":12,"cssClass":"pl-s1"},{"start":13,"end":18,"cssClass":"pl-en"}],[],[{"start":6,"end":79,"cssClass":"pl-c"}],[{"start":6,"end":71,"cssClass":"pl-c"}],[{"start":6,"end":18,"cssClass":"pl-smi"},{"start":19,"end":31,"cssClass":"pl-s1"},{"start":34,"end":54,"cssClass":"pl-s1"},{"start":55,"end":77,"cssClass":"pl-en"}],[{"start":6,"end":8,"cssClass":"pl-k"},{"start":10,"end":22,"cssClass":"pl-s1"},{"start":26,"end":30,"cssClass":"pl-c1"}],[{"start":8,"end":28,"cssClass":"pl-s1"},{"start":29,"end":58,"cssClass":"pl-en"}],[{"start":12,"end":15,"cssClass":"pl-k"},{"start":16,"end":36,"cssClass":"pl-smi"},{"start":37,"end":63,"cssClass":"pl-smi"}],[{"start":14,"end":15,"cssClass":"pl-c1"},{"start":15,"end":23,"cssClass":"pl-c1"}],[{"start":14,"end":20,"cssClass":"pl-k"},{"start":21,"end":25,"cssClass":"pl-smi"},{"start":26,"end":51,"cssClass":"pl-en"},{"start":52,"end":64,"cssClass":"pl-smi"},{"start":65,"end":77,"cssClass":"pl-s1"}],[{"start":16,"end":36,"cssClass":"pl-s1"},{"start":37,"end":69,"cssClass":"pl-en"},{"start":70,"end":74,"cssClass":"pl-smi"}],[{"start":16,"end":28,"cssClass":"pl-s1"},{"start":29,"end":58,"cssClass":"pl-en"}],[{"start":20,"end":23,"cssClass":"pl-k"},{"start":24,"end":32,"cssClass":"pl-smi"}],[{"start":22,"end":23,"cssClass":"pl-c1"},{"start":23,"end":31,"cssClass":"pl-c1"}],[{"start":22,"end":28,"cssClass":"pl-k"},{"start":29,"end":33,"cssClass":"pl-smi"},{"start":34,"end":37,"cssClass":"pl-en"}],[{"start":24,"end":30,"cssClass":"pl-s1"},{"start":31,"end":40,"cssClass":"pl-en"},{"start":41,"end":44,"cssClass":"pl-k"},{"start":45,"end":64,"cssClass":"pl-smi"}],[],[],[],[],[{"start":8,"end":12,"cssClass":"pl-k"}],[{"start":8,"end":14,"cssClass":"pl-s1"},{"start":15,"end":24,"cssClass":"pl-en"},{"start":25,"end":28,"cssClass":"pl-k"},{"start":29,"end":48,"cssClass":"pl-smi"}],[],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/codebasics/potato-disease-classification/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":false,"repoAlertsPath":"/codebasics/potato-disease-classification/security/dependabot","repoSecurityAndAnalysisPath":"/codebasics/potato-disease-classification/settings/security_analysis","repoOwnerIsOrg":true,"currentUserCanAdminRepo":false},"displayName":"ReactNativeFlipper.java","displayUrl":"https://github.com/codebasics/potato-disease-classification/blob/main/mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java?raw=true","headerInfo":{"blobSize":"3.18 KB","deleteInfo":{"deletePath":"https://github.com/codebasics/potato-disease-classification/delete/main/mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java","deleteTooltip":"Fork this repository and delete the file"},"editInfo":{"editTooltip":"Fork this repository and edit the file"},"ghDesktopPath":"https://desktop.github.com","gitLfsPath":null,"onBranch":true,"shortPath":"c605401","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fcodebasics%2Fpotato-disease-classification%2Fblob%2Fmain%2Fmobile-app%2Fandroid%2Fapp%2Fsrc%2Fdebug%2Fjava%2Fcom%2Fmldemo%2FReactNativeFlipper.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"72","truncatedSloc":"67"},"mode":"file"},"image":false,"isCodeownersFile":null,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","large":false,"loggedIn":true,"newDiscussionPath":"/codebasics/potato-disease-classification/discussions/new","newIssuePath":"/codebasics/potato-disease-classification/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/codebasics/potato-disease-classification/blob/main/mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/codebasics/potato-disease-classification/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"codebasics","repoName":"potato-disease-classification","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":false,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"ReactNativeFlipper","kind":"class","identStart":1229,"identEnd":1247,"extentStart":1216,"extentEnd":3260,"fullyQualifiedName":"ReactNativeFlipper","identUtf16":{"start":{"lineNumber":26,"utf16Col":13},"end":{"lineNumber":26,"utf16Col":31}},"extentUtf16":{"start":{"lineNumber":26,"utf16Col":0},"end":{"lineNumber":71,"utf16Col":1}}},{"name":"initializeFlipper","kind":"method","identStart":1271,"identEnd":1288,"extentStart":1252,"extentEnd":3258,"fullyQualifiedName":"ReactNativeFlipper::initializeFlipper","identUtf16":{"start":{"lineNumber":27,"utf16Col":21},"end":{"lineNumber":27,"utf16Col":38}},"extentUtf16":{"start":{"lineNumber":27,"utf16Col":2},"end":{"lineNumber":70,"utf16Col":3}}},{"name":"apply","kind":"method","identStart":2044,"identEnd":2049,"extentStart":2010,"extentEnd":2192,"fullyQualifiedName":"ReactNativeFlipper::apply","identUtf16":{"start":{"lineNumber":41,"utf16Col":24},"end":{"lineNumber":41,"utf16Col":29}},"extentUtf16":{"start":{"lineNumber":40,"utf16Col":12},"end":{"lineNumber":43,"utf16Col":13}}},{"name":"onReactContextInitialized","kind":"method","identStart":2721,"identEnd":2746,"extentStart":2685,"extentEnd":3156,"fullyQualifiedName":"ReactNativeFlipper::onReactContextInitialized","identUtf16":{"start":{"lineNumber":55,"utf16Col":26},"end":{"lineNumber":55,"utf16Col":51}},"extentUtf16":{"start":{"lineNumber":54,"utf16Col":14},"end":{"lineNumber":64,"utf16Col":15}}},{"name":"run","kind":"method","identStart":3016,"identEnd":3019,"extentStart":2972,"extentEnd":3116,"fullyQualifiedName":"ReactNativeFlipper::run","identUtf16":{"start":{"lineNumber":60,"utf16Col":34},"end":{"lineNumber":60,"utf16Col":37}},"extentUtf16":{"start":{"lineNumber":59,"utf16Col":22},"end":{"lineNumber":62,"utf16Col":23}}}]}},"csrf_tokens":{"/codebasics/potato-disease-classification/branches":{"post":"ngMdCE7QeCfS3Kf7tnpUj8m1swHPijxCzK7cc6Ih1ujrPsVoxLoM2v1H2gYux6QwOAllLjtoarVlrX2eiEj88A"}}},"title":"potato-disease-classification/mobile-app/android/app/src/debug/java/com/mldemo/ReactNativeFlipper.java at main · codebasics/potato-disease-classification","locale":"en"}