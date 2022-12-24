package pattern.proxy

class ProxyInternet : Internet {

    private val bannedSite = listOf("aaa.com", "bbb.com", "ccc.com")
    private val internet = RealInternet()

    override fun connectTo(host: String): String {
        check(bannedSite.contains(host.lowercase()).not()) {
            throw IllegalAccessException("${host}에서는 접근이 불가능합니다. ")
        }
        return internet.connectTo(host)
    }
}
