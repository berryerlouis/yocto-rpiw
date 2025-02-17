DESCRIPTION = "A library to control Raspberry Pi GPIO channels"
HOMEPAGE = "https://github.com/WiringPi/WiringPi"
SECTION = "devel/libs"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING.LESSER;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "git://github.com/WiringPi/WiringPi.git;protocol=https;branch=master \
           file://0001-improve-Makefile-to-support-Yocto-build.patch;patchdir=.. \
           "
SRCREV = "3.14"

S = "${WORKDIR}/git/wiringPi"

COMPATIBLE_MACHINE = "raspberrypi"

DEPENDS = "libxcrypt"

do_install(){
    oe_runmake DESTDIR="${D}${prefix}" install
}