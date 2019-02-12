func makeArrayConsecutive2(statues: [Int]) -> Int {
    var a = statues.sorted()
    return a.last! - a.first! + 1 - a.count
}
