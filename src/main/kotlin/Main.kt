fun main() {

    val myArray: ArrayList<Int> = arrayListOf(1, 5, 32, 2, 4, 6, 8, 23, 4, 0, 6, 7, 2, 6, 8, 5, 3, 5, 8, 93, 44, 66)


    fun summaInt(array: ArrayList<Int>): Int {

        var summa: Int = 0

        for (i in array) {
            summa += i
        }

        return summa

    }


    fun maxInt(array: ArrayList<Int>): Int {

        var max: Int = -1

        for (i in array) {
            if (i > max) {
                max = i
            }
        }

        return max

    }


    fun minInt(array: ArrayList<Int>): Int {

        var min: Int = 100

        for (i in array) {
            if (i < min) {
                min = i
            }
        }

        return min

    }


    fun sortMaxToMin(array: ArrayList<Int>): ArrayList<Int> {

        var t: Int = 0

        for (i in 0..array.size-1) {

            for (j in array.size-1 downTo i) {

                if (array[i] < array[j]) {
                    t = array[i]
                    array[i] = array[j]
                    array[j] = t
                }
            }

        }

        return array

    }


    fun sortMinToMax(array: ArrayList<Int>): ArrayList<Int> {

        var t: Int = 0

        for (i in 0..array.size-1) {

            for (j in array.size-1 downTo i) {

                if (array[i] > array[j]) {
                    t = array[i]
                    array[i] = array[j]
                    array[j] = t
                }
            }

        }

        return array

    }


    fun masChet(array: ArrayList<Int>): ArrayList<Int> {

        var mas: ArrayList<Int> = arrayListOf()

        for (i in array) {

            if (i % 2 == 0) {
                mas.add(i)
            }
        }

        return mas

    }


    fun masNeChet(array: ArrayList<Int>): ArrayList<Int> {

        var mas: ArrayList<Int> = arrayListOf()

        for (i in array) {

            if (i % 2 != 0) {
                mas.add(i)
            }
        }

        return mas

    }


    fun summaChet(array: ArrayList<Int>): Int {

        var summa: Int = 0

        for (i in array) {

            if (i % 2 == 0) {
                summa += i
            }

        }

        return summa

    }


    fun summaNeChet(array: ArrayList<Int>): Int {

        var summa: Int = 0

        for (i in array) {

            if (i % 2 != 0) {
                summa += i
            }

        }

        return summa

    }


    fun unification(array: ArrayList<Int>): ArrayList<Int> {

        var mas1: ArrayList<Int> = arrayListOf()
        var mas2: ArrayList<Int> = arrayListOf()

        mas1 = sortMinToMax(masChet(myArray))
        mas2 = sortMinToMax(masNeChet(myArray))

        var masAll = mas1 + mas2

        return masAll as ArrayList<Int>

    }


    fun rand(array: ArrayList<Int>): String {

        var rnd: Int = (0..100).random()
        var c: Boolean = false
        var result: String = "Число $rnd находится в массиве $c"

        for (i in array) {

            if (i == rnd) {
                c = true
                break
            } else {
                continue
            }
        }

        return result

    }


    fun kolvoEl(array: ArrayList<Int>): String {

        var counter0: Int = 0
        var counter1: Int = 0
        var counter2: Int = 0
        var counter3: Int = 0
        var counter4: Int = 0
        var counter5: Int = 0
        var counter6: Int = 0
        var counter7: Int = 0
        var counter8: Int = 0
        var counter32: Int = 0
        var counter23: Int = 0
        var counter93: Int = 0
        var counter44: Int = 0
        var counter66: Int = 0


        for (i in array) {

            when(i) {
                0 -> counter0 += 1
                1 -> counter1 += 1
                2 -> counter2 += 1
                3 -> counter3 += 1
                4 -> counter4 += 1
                5 -> counter5 += 1
                6 -> counter6 += 1
                7 -> counter7 += 1
                8 -> counter8 += 1
                32 -> counter32 += 1
                23 -> counter23 += 1
                93 -> counter93 += 1
                44 -> counter44 += 1
                66 -> counter66 += 1
                else -> null
            }

        }

        var result: String = "Число 0 - $counter0, Число 1 - $counter0, Число 2 - $counter2, Число 3 - $counter3, Число 4 - $counter4, Число 5 - $counter5, Число 6 - $counter6, Число 7 - $counter7, Число 8 - $counter8, Число 23 - $counter23, Число 32 - $counter32, Число 44 - $counter44, Число 66 - $counter66, Число 93 - $counter93"

        return result

    }


    println("Сумма чисел массива: ${summaInt(myArray)}")
    println("Максимальное число массива: ${maxInt(myArray)}")
    println("Минимальное число массива: ${minInt(myArray)}")
    println("От максимального к минимальному: ${sortMaxToMin(myArray)}")
    println("От минимального к максимальному: ${sortMinToMax(myArray)}")
    println("Четные числа массива: ${masChet(myArray)}")
    println("Четные числа массива: ${masNeChet(myArray)}")
    println("Сумма четных чисел массива: ${summaChet(myArray)}")
    println("Сумма нечетных чисел массива: ${summaNeChet(myArray)}")
    println("Объединение массивов: ${unification(myArray)}")
    println("Не придумал текст: ${rand(myArray)}")
    println("Не придумал текст: ${kolvoEl(myArray)}")

}