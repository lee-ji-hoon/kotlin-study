package pattern.proxy

class RealInternet : Internet {

    override fun connectTo(host: String): String {
        return "${host}에 연결 됐습니다."
    }
}
