package Collection;

/*
    存储在 hashMap 和 hashSet 集合 中的元素必须重写hashCode和equals方法
    无序不可重复是因为
    hashCode导致无序   equals导致不可重复

    先调用hashCode在调用equals
    拿 map.put(key, value) 举例
      通过对key调用hashCode转成hash值
      通过hash值查找数组中对应位置的链表
      若是null 不调用equals方法
      若有值 调用equals方法
 */

public class HashCodeTest {
}
