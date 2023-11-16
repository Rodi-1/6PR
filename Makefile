
build:
	java -jar signapk.jar -w platform.x509.pem platform.pk8 app-debug-signed.apk verX-signed.apk
	adb install -r verX-signed.apk
	del app-debug-signed.apk
	
delete:
	adb uninstall me.test.calculator