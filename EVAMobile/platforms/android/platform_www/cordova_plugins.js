cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "id": "cordova-plugin-device.device",
        "file": "plugins/cordova-plugin-device/www/device.js",
        "pluginId": "cordova-plugin-device",
        "clobbers": [
            "device"
        ]
    },
    {
        "id": "cordova-plugin-splashscreen.SplashScreen",
        "file": "plugins/cordova-plugin-splashscreen/www/splashscreen.js",
        "pluginId": "cordova-plugin-splashscreen",
        "clobbers": [
            "navigator.splashscreen"
        ]
    },
    {
        "id": "cordova-plugin-statusbar.statusbar",
        "file": "plugins/cordova-plugin-statusbar/www/statusbar.js",
        "pluginId": "cordova-plugin-statusbar",
        "clobbers": [
            "window.StatusBar"
        ]
    },
    {
        "id": "cordova-plugin-tts.tts",
        "file": "plugins/cordova-plugin-tts/www/tts.js",
        "pluginId": "cordova-plugin-tts",
        "clobbers": [
            "TTS"
        ]
    },
    {
        "id": "cordova-plugin-whitelist.whitelist",
        "file": "plugins/cordova-plugin-whitelist/whitelist.js",
        "pluginId": "cordova-plugin-whitelist",
        "runs": true
    },
    {
        "id": "ionic-plugin-keyboard.keyboard",
        "file": "plugins/ionic-plugin-keyboard/www/android/keyboard.js",
        "pluginId": "ionic-plugin-keyboard",
        "clobbers": [
            "cordova.plugins.Keyboard"
        ],
        "runs": true
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognition",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognition.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognition"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognitionError",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognitionError.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognitionError"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognitionAlternative",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognitionAlternative.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognitionAlternative"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognitionResult",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognitionResult.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognitionResult"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognitionResultList",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognitionResultList.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognitionResultList"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechRecognitionEvent",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechRecognitionEvent.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechRecognitionEvent"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechGrammar",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechGrammar.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechGrammar"
        ]
    },
    {
        "id": "org.apache.cordova.speech.speechrecognition.SpeechGrammarList",
        "file": "plugins/org.apache.cordova.speech.speechrecognition/www/SpeechGrammarList.js",
        "pluginId": "org.apache.cordova.speech.speechrecognition",
        "clobbers": [
            "SpeechGrammarList"
        ]
    },
    {
        "id": "com.phonegap.plugins.speech.XSpeechRecognizer",
        "file": "plugins/com.phonegap.plugins.speech/www/XSpeechRecognizer.js",
        "pluginId": "com.phonegap.plugins.speech",
        "clobbers": [
            "plugins.speechrecognizer"
        ]
    },
    {
        "id": "cordova-plugin-file.DirectoryEntry",
        "file": "plugins/cordova-plugin-file/www/DirectoryEntry.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.DirectoryEntry"
        ]
    },
    {
        "id": "cordova-plugin-file.DirectoryReader",
        "file": "plugins/cordova-plugin-file/www/DirectoryReader.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.DirectoryReader"
        ]
    },
    {
        "id": "cordova-plugin-file.Entry",
        "file": "plugins/cordova-plugin-file/www/Entry.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.Entry"
        ]
    },
    {
        "id": "cordova-plugin-file.File",
        "file": "plugins/cordova-plugin-file/www/File.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.File"
        ]
    },
    {
        "id": "cordova-plugin-file.FileEntry",
        "file": "plugins/cordova-plugin-file/www/FileEntry.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileEntry"
        ]
    },
    {
        "id": "cordova-plugin-file.FileError",
        "file": "plugins/cordova-plugin-file/www/FileError.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileError"
        ]
    },
    {
        "id": "cordova-plugin-file.FileReader",
        "file": "plugins/cordova-plugin-file/www/FileReader.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileReader"
        ]
    },
    {
        "id": "cordova-plugin-file.FileSystem",
        "file": "plugins/cordova-plugin-file/www/FileSystem.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileSystem"
        ]
    },
    {
        "id": "cordova-plugin-file.FileUploadOptions",
        "file": "plugins/cordova-plugin-file/www/FileUploadOptions.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileUploadOptions"
        ]
    },
    {
        "id": "cordova-plugin-file.FileUploadResult",
        "file": "plugins/cordova-plugin-file/www/FileUploadResult.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileUploadResult"
        ]
    },
    {
        "id": "cordova-plugin-file.FileWriter",
        "file": "plugins/cordova-plugin-file/www/FileWriter.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.FileWriter"
        ]
    },
    {
        "id": "cordova-plugin-file.Flags",
        "file": "plugins/cordova-plugin-file/www/Flags.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.Flags"
        ]
    },
    {
        "id": "cordova-plugin-file.LocalFileSystem",
        "file": "plugins/cordova-plugin-file/www/LocalFileSystem.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.LocalFileSystem"
        ],
        "merges": [
            "window"
        ]
    },
    {
        "id": "cordova-plugin-file.Metadata",
        "file": "plugins/cordova-plugin-file/www/Metadata.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.Metadata"
        ]
    },
    {
        "id": "cordova-plugin-file.ProgressEvent",
        "file": "plugins/cordova-plugin-file/www/ProgressEvent.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.ProgressEvent"
        ]
    },
    {
        "id": "cordova-plugin-file.fileSystems",
        "file": "plugins/cordova-plugin-file/www/fileSystems.js",
        "pluginId": "cordova-plugin-file"
    },
    {
        "id": "cordova-plugin-file.requestFileSystem",
        "file": "plugins/cordova-plugin-file/www/requestFileSystem.js",
        "pluginId": "cordova-plugin-file",
        "clobbers": [
            "window.requestFileSystem"
        ]
    },
    {
        "id": "cordova-plugin-file.resolveLocalFileSystemURI",
        "file": "plugins/cordova-plugin-file/www/resolveLocalFileSystemURI.js",
        "pluginId": "cordova-plugin-file",
        "merges": [
            "window"
        ]
    },
    {
        "id": "cordova-plugin-file.isChrome",
        "file": "plugins/cordova-plugin-file/www/browser/isChrome.js",
        "pluginId": "cordova-plugin-file",
        "runs": true
    },
    {
        "id": "cordova-plugin-file.androidFileSystem",
        "file": "plugins/cordova-plugin-file/www/android/FileSystem.js",
        "pluginId": "cordova-plugin-file",
        "merges": [
            "FileSystem"
        ]
    },
    {
        "id": "cordova-plugin-file.fileSystems-roots",
        "file": "plugins/cordova-plugin-file/www/fileSystems-roots.js",
        "pluginId": "cordova-plugin-file",
        "runs": true
    },
    {
        "id": "cordova-plugin-file.fileSystemPaths",
        "file": "plugins/cordova-plugin-file/www/fileSystemPaths.js",
        "pluginId": "cordova-plugin-file",
        "merges": [
            "cordova"
        ],
        "runs": true
    },
    {
        "id": "cordova-plugin-media.MediaError",
        "file": "plugins/cordova-plugin-media/www/MediaError.js",
        "pluginId": "cordova-plugin-media",
        "clobbers": [
            "window.MediaError"
        ]
    },
    {
        "id": "cordova-plugin-media.Media",
        "file": "plugins/cordova-plugin-media/www/Media.js",
        "pluginId": "cordova-plugin-media",
        "clobbers": [
            "window.Media"
        ]
    },
    {
        "id": "cordova-plugin-speechrecognizer.SpeechRecognizer",
        "file": "plugins/cordova-plugin-speechrecognizer/SpeechRecognizer.js",
        "pluginId": "cordova-plugin-speechrecognizer",
        "clobbers": [
            "plugins.speechrecognizer"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "cordova-plugin-console": "1.0.2",
    "cordova-plugin-device": "1.1.0",
    "cordova-plugin-splashscreen": "3.0.0",
    "cordova-plugin-statusbar": "2.0.0",
    "cordova-plugin-tts": "0.2.3",
    "cordova-plugin-whitelist": "1.2.0",
    "ionic-plugin-keyboard": "1.0.8",
    "org.apache.cordova.speech.speechrecognition": "0.1.1",
    "com.phonegap.plugins.speech": "1.0.0",
    "cordova-plugin-compat": "1.0.0",
    "cordova-plugin-file": "4.2.0",
    "cordova-plugin-media": "2.4.1-dev",
    "cordova-plugin-speechrecognizer": "1.0.0"
};
// BOTTOM OF METADATA
});