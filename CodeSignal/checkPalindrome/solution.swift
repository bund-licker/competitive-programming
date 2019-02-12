func checkPalindrome(inputString: String) -> Bool {
    let characters = Array(inputString.lowercased())
    var currentIndex = 0
    
    while currentIndex < characters.count/2 {
        if characters[currentIndex] != characters[characters.count-currentIndex-1]{
            return false
        }
        
        currentIndex += 1
        
    }
    return true
}
