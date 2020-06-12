SUMMARY = "The lightning-fast ASGI server"
HOMEPAGE = "https://www.uvicorn.org/"
LICENSE = "BSD"
RDEPENDS_${PN} += "\
    python3-click \
    python3-h11 \
    python3-httptools \
    python3-typing \
    python3-uvloop \
    python3-websockets \
    python3-wsproto \
"

inherit pypi setuptools3

SRC_URI[md5sum] = "9f82b3674ced119596afe3b7b977f82c"
SRC_URI[sha256sum] = "596eaa8645b6dbc24d6610e335f8ddf5f925b4c4b86fdc7146abb0bf0da65d17"
