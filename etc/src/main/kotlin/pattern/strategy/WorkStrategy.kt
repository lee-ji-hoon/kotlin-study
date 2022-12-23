package pattern.strategy

interface WorkStrategy {
    fun goToBy(): String
}

class BySubwayStrategy : WorkStrategy {
    override fun goToBy() = "지하철"
}

class ByCarStrategy : WorkStrategy {
    override fun goToBy() = "자가용"
}
