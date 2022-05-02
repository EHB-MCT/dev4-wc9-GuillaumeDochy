fun main(args: Array<String>) {
    val reader = FileReader()

//    println(reader.getPuzzle1())
//
//    val read = reader.getPuzzle1()

    //part 1
//    var count = 0
//    var prev = 0
//
//    for (r in read){
//        if (prev < 2000 && r == read[prev+1]){
//            if (read[prev] < r){
//                count++
//            }
//            prev++
//        }
//    }
//    println(prev)
//    println(count)

    //part 2
//    var current = 0
//    var count = 0
//
//    for (r in read){
//        if (current<1997){
//            var A = read[current] + read[current+1] + read[current+2]
//            var B = read[current+1] + read[current+2] + read[current+3]
//            if (A<B){
//                count ++
//            }
//        }
//        current++
//    }
//    println(count)

//    println(reader.getPuzzle2())
//    val read2 = reader.getPuzzle2()

    //part 1
//    var position = 0
//    var depth = 0
//
//    for (r in read2){
//        var currentPos: Int
//        var currentDown: Int
//        var currentUp: Int
//        if (r[0] == "forward"){
//            currentPos = r[1] as Int
//            position += currentPos
//        } else if (r[0] == "down"){
//            val currentDepth = depth
//            currentDown = r[1] as Int
//            depth = currentDepth + currentDown
//        } else if (r[0] == "up"){
//            currentUp = r[1] as Int
//            val currentDepth = depth
//            depth = currentDepth - currentUp
//        }
//    }


    //part 2
//    var position = 0
//    var depth = 0
//    var aim = 0
//
//    for (r in read2){
//        var currentPos: Int
//        var currentDown: Int
//        var currentUp: Int
//        if (r[0] == "forward"){
//            currentPos = r[1] as Int
//            position += currentPos
//            if (aim>0){
//                depth += currentPos * aim
//            }
//        } else if (r[0] == "down"){
//            val currentAim = aim
//            currentDown = r[1] as Int
//            aim = currentAim + currentDown
//        } else if (r[0] == "up"){
//            currentUp = r[1] as Int
//            val currentAim = aim
//            aim = currentAim - currentUp
//        }
//    }
//
//    println(position)
//    println(depth)
//    println(position*depth)

    println(reader.getPuzzle3())
    val read3 = reader.getPuzzle3()

    //part 1
    var amountOf1 = 0
    var amountOf0 = 0
    val indexer = intArrayOf(0,1,2,3,4,5,6,7,8,9,10,11)

//    val gamma = IntArray(12)
//    val epsilonRate = IntArray(12)
//
//    for (i in indexer) {
//        for (r in read3){
//            r.toIntArray()
//            if (r[i] == 1){
//                amountOf1++
//            } else if(r[i] == 0){
//                amountOf0++
//            }
//        }
//        if (amountOf1 > amountOf0){
//            gamma[i] = 1
//            epsilonRate[i] = 0
//        } else if (amountOf1 < amountOf0){
//            gamma[i] = 0
//            epsilonRate[i] = 1
//        }
//        println(amountOf0)
//        println(amountOf1)
//        amountOf0 = 0
//        amountOf1 = 0
//    }
//
//    var gam: String = ""
//    var epsi: String = ""
//
//    for (g in gamma){
//        gam += g
//    }
//    for (e in epsilonRate){
//        epsi += e
//    }
//
//    println(gam)
//    println(epsi)
//    println(654*3441)


//    part 2
    var listOfNumbers: MutableList<Int>

    for (i in indexer) {
        for (r in read3){
            r.toIntArray()
            if (r[i] == 1){
                amountOf1++
            }else if(r[i] == 0){
                amountOf0++
            }
            if (amountOf0 < amountOf1){
                if (r[i] == 1){
                    val correct= r.toIntArray()
                    listOfNumbers = correct.toMutableList()
                    println(listOfNumbers)
                }
            } else if(amountOf0 > amountOf1){
                if (r[i] == 0){
                    val correct= r.toIntArray()
                    listOfNumbers = correct.toMutableList()
                    println(listOfNumbers)
                }
            }
            amountOf0 = 0
            amountOf1 = 0
        }
    }



    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())

}
