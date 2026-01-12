/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    
    newArray = []
    for(let i = 0; i<arr.length; i++){
        res = fn(arr[i], i)
        if (res) newArray.push(arr[i]);
    };
    console.log(newArray);
    return newArray;

};