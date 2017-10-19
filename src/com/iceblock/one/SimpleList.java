package com.iceblock.one;

/**
 * 模拟 ArrayList 简单实现
 *
 * @author yan.liang@ustcinfo.com
 * @date 2017/10/19
 */
public class SimpleList {

    private int size;
    private Object[] objects;

    /**
     * 增加元素
     */
    public void add(Object o) {
        if (objects == null) {
            objects = new Object[10];
            size = 0;
        }
        objects[size] = o;
        size++;
    }

    /**
     * 删除元素
     */
    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("超过队列长度");
        } else {
            Object[] newObjects = new Object[size];
            for (int i = 0, j = 0; i < size; i++) {
                if (i != index) {
                    newObjects[j++] = objects[i];
                }
            }
            objects = newObjects;
            size--;
        }
    }

    /**
     * 获取元素
     */
    public Object get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("超过队列长度");
        } else {
            return objects[index];
        }
    }

    /**
     * 队列大小
     */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        for (int i = 0; i < simpleList.size() ; i++) {
            System.out.println(simpleList.get(i));
        }

        simpleList.remove(1);
        for (int i = 0; i < simpleList.size() ; i++) {
            System.out.println(simpleList.get(i));
        }
    }
}
