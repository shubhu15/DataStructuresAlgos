func isAnagram(s string, t string) bool {
    
    smap := make(map[rune]int)

    if len(s)!= len(t) {
        return false
    }

    for _,v := range s {
        smap[v]++
    }

    for _,v:= range t {
        smap[v]--
        if smap[v]<0{
            return false
        }
    }

    return true


    
}