require xorg-app-common.inc
DESCRIPTION = "adjust backlight brightness using RandR extension"
DEPENDS += " libxrender libxrandr"
PE = "1"
PR = "${INC_PR}.0"

SRC_URI[archive.md5sum] = "51b4a1c0ae2b3bd77417306fd78a3e94"
SRC_URI[archive.sha256sum] = "c795001f15974569e16f25b201ac2ac7666c5a646f8d0de3afa0c3a1ba5d64a4"