class Solution {
    /**
     * @param {number[][]} points
     * @param {number} k
     * @return {number[][]}
     */
    kClosest(points, k) {
class Heap{
    constructor(){
        this.size = 0
        this.list = []
    }
    getParent(index){
        return Math.floor((index-1)/2)
    }
    getLeftChild(index){
        return (2*index)+1
    }
    getRightChild(index){
        return (2*index)+2
    }
    swap(left,right){
        let temp = this.list[left]
        this.list[left] = this.list[right]
        this.list[right] = temp
        return
    }
    insert(data){
        this.list.push(data)
        this.size+=1
        let curIndex = this.list.length-1
        let parentIndex
        while(curIndex > 0){
             parentIndex = this.getParent(curIndex)
            if(this.list[parentIndex]["priority"] < this.list[curIndex]["priority"]){
                break
            }
            this.swap(parentIndex,curIndex)
            curIndex = parentIndex
        }
        return
    }
    remove(){
        if(this.size === 0){
            return
        }
        this.swap(0,this.list.length-1)
        let data = this.list.pop()
        console.log(data)
        this.size-=1
        this.sink()
        return data
    }
    show(){
        console.log(this.list)
    }
sink() {
    let index = 0;
    while (true) {
        let leftChild = this.getLeftChild(index);
        let rightChild = this.getRightChild(index);
        let largestChild = index;

        // Check if the left child exists and is greater
        if (leftChild < this.size && this.list[leftChild]["priority"] < this.list[largestChild]["priority"]) {
            largestChild = leftChild;
        }

        // Check if the right child exists and is greater
        if (rightChild < this.size && this.list[rightChild]["priority"] < this.list[largestChild]["priority"]) {
            largestChild = rightChild;
        }

        // If the current node is the largest, stop sinking
        if (largestChild === index) {
            break;
        }

        // Swap with the largest child and move the index down
        this.swap(largestChild, index);
        index = largestChild;
    }
}

}
let res = []
const maHeap = new Heap()
        let distanceArray = []
        for(let coordinates of points){
            let distance = Math.sqrt(
                Math.pow(coordinates[0], 2) + Math.pow(coordinates[1], 2)
                )
            distanceArray.push({
                "coordinate":coordinates,
                "priority":distance
            })
        }
        for(let point of distanceArray){
            maHeap.insert(point)
        }
        for(let i = 0; i < k; i++){
            let data = maHeap.remove()
            res.push(data["coordinate"])

        }

        return res
        
    }
}
