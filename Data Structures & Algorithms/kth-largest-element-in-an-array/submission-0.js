class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number}
     */
    findKthLargest(nums, k) {
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
            if(this.list[parentIndex] > this.list[curIndex]){
                break
            }
            this.swap(parentIndex,curIndex)
            curIndex = parentIndex
        }
        return
    }
    remove(){
        this.swap(0,this.list.length-1)
        let data = this.list.pop()
        console.log(data)
        this.sink()
        return data
    }
    show(){
        console.log(this.list)
    }
    sink(){
        let leftChild,rightChild,largestChild
        let index = 0
        while(true){
            leftChild = this.getLeftChild(index)
            rightChild = this.getRightChild(index)
            largestChild = index
            if(leftChild < this.size && this.list[leftChild] > this.list[largestChild]){
                largestChild = leftChild
            }
            if(rightChild < this.size && this.list[rightChild] > this.list[largestChild]){
                largestChild = rightChild
            }
            if( index === largestChild){
                break
            }
            this.swap(largestChild,index)
            index = largestChild
        }
    }
}
     let maHeap = new Heap()
     for(let num of nums){
        maHeap.insert(num)
     }
     let data
     for(let i = 0 ; i < k;i++){
        data = maHeap.remove()
     }
     return data
    }
}
