
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "4bae0e56d97a2c03b62927781d737196",
        "aarch64-unknown-linux-musl": "c67deb5ab5b32a4300415ae57e7ac25e",
        "arm-unknown-linux-gnueabi": "1477d5aed88cb6b02bac19e489686b76",
        "arm-unknown-linux-gnueabihf": "c4b47a8647434ac331b3d01cea20d1cd",
        "armv5te-unknown-linux-gnueabi": "5f9ef7b5d7ad38c99eb6493557e50853",
        "armv5te-unknown-linux-musleabi": "6daa4b43e454e031fac482af81487807",
        "armv7-unknown-linux-gnueabihf": "fe6be99a523d0217fa2fe3f9dcae66a7",
        "armv7-unknown-linux-musleabihf": "df22803ef42eefd0c6fe1c0ec90baf0e",
        "i686-unknown-linux-gnu": "e37fbced91eb1307b12b1dc3edfd4e3b",
        "mips-unknown-linux-gnu": "673cc7b47a9206cb7685d434acad3861",
        "mipsel-unknown-linux-gnu": "31795eb1c565188d360a364fc7ed01b8",
        "powerpc-unknown-linux-gnu": "317fd21fdcbbdee25350b6f009994b9d",
        "x86_64-unknown-linux-gnu": "eee172882affcd957b1243845d738389",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "0bc84a7cf89579b5f0a8283f0c2b68fd8c97d51dce7aad06ef0a4d65c0f8740c",
        "aarch64-unknown-linux-musl": "fc60e3dc7475626c7f4c77e054d0d75eadf456f25db6cf31cb99d74e99cda9b8",
        "arm-unknown-linux-gnueabi": "4feb92ee5d3da066e188b0445e49fd6c9cf50e3d080ae945f06acd212c5e94a8",
        "arm-unknown-linux-gnueabihf": "52171721ad46c1317edfc7f6a6a765abddbde9e02faaae4e6ea39dab12a7421d",
        "armv5te-unknown-linux-gnueabi": "1e0f9834cd5497fba83fc8e6765d867047dfcb7e99a8ae2d9567656081f93870",
        "armv5te-unknown-linux-musleabi": "97d8dbb5f0b594a29b367e822a3562eac2a777aad31e4230a579acc26721acbc",
        "armv7-unknown-linux-gnueabihf": "160b1c28c09eb244046ef317394e5d41abdbb2cc9e2123b3fcd36957de377cfc",
        "armv7-unknown-linux-musleabihf": "82c154d219a0eebe5aa2201a909aa126cffdb81a4719f9738b52e92cdd86d8ca",
        "i686-unknown-linux-gnu": "35d128b4c3c8147ff323039498ee486e686b1fdb68f43a435f71cd1c8e3f51c9",
        "mips-unknown-linux-gnu": "7a8246e16209c2b7c6ebb29f9e446aa625d7a5b9e637bb895f38c9b84727a599",
        "mipsel-unknown-linux-gnu": "4e0fb66d792cb1afa2b49d6d30632964d114e365acde5b0803a5186f9a1249ab",
        "powerpc-unknown-linux-gnu": "67c8329ea949430ccd74b7fc84f4e14a1f54891ebd1eaf8aec5a9109a09d7dae",
        "x86_64-unknown-linux-gnu": "e45b1dfe0548da91a2182032c910b8aaf5b3f09ae54a062702ff2752a9d2afc8",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "5207af59ade0cc7d73fed2097a8f9e97",
        "arm-unknown-linux-gnueabi": "e625a57dd1376566ce84a8cbc16d3d4b",
        "arm-unknown-linux-gnueabihf": "400b8834ab7bfc975c458d781d5d1f6c",
        "armv7-unknown-linux-gnueabihf": "c5342c62c8ca769bca1d172ba194b01b",
        "i686-unknown-linux-gnu": "6b62ad9485c41daa05daad607fdec0d7",
        "x86_64-unknown-linux-gnu": "2431c313239bd87e6ba7acf261a4c63a",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "aarch64-unknown-linux-gnu": "62147bb212ed54b38e45b9cbe8f9ac7e9fc77e4462526370dc2258b5bd09dd21",
        "arm-unknown-linux-gnueabi": "6985229d561e01aeeaee7d1fd01adf4c5e116af74fa7a5ae16da810d8e554b73",
        "arm-unknown-linux-gnueabihf": "b4dcaff92212ca279d3a9c6e305f151d4e5c970fa1dbc4b22aa6e7469b1a009f",
        "armv7-unknown-linux-gnueabihf": "26e449bedac53009fd1111222df2bc534ac0cb837b3f93c365eeea009a613594",
        "i686-unknown-linux-gnu": "c48b65106e986af65ca4cda816547b04b698d6f077bb9573b5d6bc9434114029",
        "x86_64-unknown-linux-gnu": "18d1b83d06bb9c387c67d90afcd1a527523ad276f3440817261cd74d9f75f1f4",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=93a95682d51b4cb0a633a97046940ef0"

require rust-bin-cross.inc
