func allLongestStrings(inputArray: [String]) -> [String] {
    var iArr: [String] = []
    
    //Create new array with length of each string size
    let result = inputArray.map {$0.count}
    
    //Find the Max length string
    let max = result.max()
    
    //Create an Array to find the indexes of all the occurences of the longest string
    let indexes = result.enumerated().filter {
            $0.element == max
            }.map{$0.offset}
    
    
    //Create a new array that apprends the longest strings
    for i in indexes{
        iArr.append(inputArray[i])
    }
    
    
    return iArr
}
