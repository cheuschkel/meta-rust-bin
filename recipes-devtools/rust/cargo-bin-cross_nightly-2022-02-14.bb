
# Recipe for cargo 20220214
# This corresponds to rust release nightly

def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)

def cargo_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "a81492fbdb01fcb949b6875d0a632804",
        "arm-unknown-linux-gnueabi": "2ccfa247cedf799d64cc07194b424a99",
        "arm-unknown-linux-gnueabihf": "01371f6a6aeb2ca14dfb8eec0b7fc37e",
        "armv7-unknown-linux-gnueabihf": "d8ee4120e30aaf90d6169af2bd85a6d6",
        "i686-unknown-linux-gnu": "a43093df75592f5fd2b6855d9c3c31b2",
        "x86_64-unknown-linux-gnu": "1f53cea1d1b3355443b5f7f275446d1e",
    }
    return get_by_triple(HASHES, triple)

def cargo_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "74398e95b329d7db871ef7330d08193a38c14136663fa0aa64710f5c9710bb4d",
        "arm-unknown-linux-gnueabi": "53c3ee079dd928e5e02f984b070877502449f01eaf3d0a97d9b6585618e1c8ae",
        "arm-unknown-linux-gnueabihf": "05714a020644127043ad98754f722dd09b1dde18ab9dabef74e5e1d1c6246376",
        "armv7-unknown-linux-gnueabihf": "84a3b7ce2917f5fbeb9c169ca3e1d8c3e2e4fa6a16d9037c57d6bab79476397f",
        "i686-unknown-linux-gnu": "7e7aa656dd77b72fb699b5ae2fb83ea50017a042961d7610faf7945843081d79",
        "x86_64-unknown-linux-gnu": "39d21af8b3fc5d431e0fb793fc10c7d8cef7188f72f69da7d74c14adb250bf53",
    }
    return get_by_triple(HASHES, triple)

def cargo_url(triple):
    URLS = {
        "aarch64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-aarch64-unknown-linux-gnu.tar.gz",
        "arm-unknown-linux-gnueabi": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-arm-unknown-linux-gnueabi.tar.gz",
        "arm-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-arm-unknown-linux-gnueabihf.tar.gz",
        "armv7-unknown-linux-gnueabihf": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-armv7-unknown-linux-gnueabihf.tar.gz",
        "i686-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-i686-unknown-linux-gnu.tar.gz",
        "x86_64-unknown-linux-gnu": "https://static.rust-lang.org/dist/2022-02-14/cargo-nightly-x86_64-unknown-linux-gnu.tar.gz",
    }
    return get_by_triple(URLS, triple)

DEPENDS += "rust-bin-cross-${TARGET_ARCH} (= nightly-2022-02-14)"

LIC_FILES_CHKSUM = "\
    file://LICENSE-APACHE;md5=71b224ca933f0676e26d5c2e2271331c \
    file://LICENSE-MIT;md5=b377b220f43d747efdec40d69fcaa69d \
"

require cargo-bin-cross.inc
