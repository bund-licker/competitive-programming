func sortByHeight(a: [Int]) -> [Int] {
let indexes = a.enumerated().filter {
            $0.element == -1
            }.map{$0.offset}
    
    var sArray: [Int] = []
    sArray = a.filter {$0 != -1}
    sArray.sort()
    
    for i in indexes{
        sArray.insert(-1, at:i)
        print(indexes)
    }
    
    return sArray
}
