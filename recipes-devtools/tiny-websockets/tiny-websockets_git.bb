# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://../LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/berryerlouis/TinyWebsockets;protocol=https;branch=master"

# Modify these as desired
PV = "1.0+git"
SRCREV = "a246a999878942979f1ca1a067c70eeed39a0626"

S = "${WORKDIR}/git/tiny_websockets_lib"

DEPENDS = "openssl"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install:append() {
    cp -r ${S}/include ${D}${includedir}
}