# CircularList

# Each node has a reference to the next and previous node given it has more than more node.
# With only one node, previous is set to null and next to itself
# First node always has previous as null as there is no node before the first one
# Last node always has reference to the first node as it it circular
# Removing the first item when there's only one item should set head to null
# Removing the first item when there are other items should set head to the next node and previous of second node to null and next of last to the second node
# Everytime you add new node should accumulate size by one
# Everytime you remove a node should decrease size by one