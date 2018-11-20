class Mathematics {
    companion object {
        fun factorial(num: Int): Long {
            var fac: Long = 1
            for (i in 1..num) {
                // factorial = factorial * i;
                fac *= i.toLong()
            }

            return fac
        }
    }
}