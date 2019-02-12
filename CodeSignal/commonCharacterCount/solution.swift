func commonCharacterCount(s1: String, s2: String) -> Int {

    var mutableFirstString = s1
    var counter = 0
    s2.characters.forEach {
        if let index = mutableFirstString.index(of:$0) {
            counter = counter + 1
            mutableFirstString.remove(at:index)
            
        }
    }
    
    return counter
}
