#Ruby对象分配
#   提前创建成百上千个对象，
#   并串在链表上，为可用列表
#   
#python对象分配
#   用一个创建一个
#   一个不用立即清除
#   
#python隔代回收
#   两个对象相互引用的情况下，
#   并且计数为1的情况下，
#   计数减1，如果计数为0，
#   释放，并且不为0的对象进入下一代