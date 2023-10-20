/*
341. Flatten Nested List Iterator
Difficulty:

341_Flatten_Nested_List_Iterator.java
*/

public class NestedIterator implements Iterator<Integer> {
  public NestedIterator(List<NestedInteger> nestedList) {
    addInteger(nestedList);
  }

  @Override
  public Integer next() {
    return q.poll();
  }

  @Override
  public boolean hasNext() {
    return !q.isEmpty();
  }

  private Queue<Integer> q = new ArrayDeque<>();

  private void addInteger(final List<NestedInteger> nestedList) {
    for (final NestedInteger ni : nestedList)
      if (ni.isInteger())
        q.offer(ni.getInteger());
      else
        addInteger(ni.getList());
  }
}

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

