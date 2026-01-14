/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        functions.reverse();
        let lex = x;
        for(let i = 0; i<functions.length; i++){
            fnc = functions[i]
            lex = fnc(lex)
            x = lex
            console.log(lex)
            console.log(x)
        }
        return x;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */