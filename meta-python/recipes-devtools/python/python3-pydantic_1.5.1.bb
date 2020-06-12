SUMMARY = "Data validation and settings management using python 3.6 type hinting"
HOMEPAGE = "https://github.com/samuelcolvin/pydantic"
LICENSE = "MIT"
RDEPENDS_${PN} += "\
    python3-image \
    python3-typing \
"

inherit pypi setuptools3

SRC_URI[md5sum] = "866774950cb506f15c309875b7297240"
SRC_URI[sha256sum] = "f0018613c7a0d19df3240c2a913849786f21b6539b9f23d85ce4067489dfacfa"
