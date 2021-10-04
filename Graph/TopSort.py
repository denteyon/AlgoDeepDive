#Python program to print topological sorting of a DAG
from collections import defaultdict
 
#Class to represent a graph
class Graph:
    def __init__(self,vertices):
        self.adj = defaultdict(list) #dictionary containing adjacency List
        self.V = vertices #No. of vertices
 
    # function to add an edge to graph
    def addEdge(self,u,v):
        self.adj[u].append(v)
 
    # A recursive function used by topologicalSort
    def topologicalSortUtil(self, v, visited, stack):
 
        # Mark the current node as visited.
        visited.add(v)
 
        # Recur for all the vertices adjacent to this vertex
        for vertex in self.adj[v]:
            if vertex not in visited:
                self.topologicalSortUtil(vertex, visited, stack)
 
        # Push current vertex to stack which stores result
        stack.append(v)
 
    # The function to do Topological Sort. It uses recursive
    # topologicalSortUtil()
    def topologicalSort(self):
        # Mark all the vertices as not visited
        visited = set()
        stack =[]
 
        # Call the recursive helper function to store Topological
        # Sort starting from all vertices one by one
        for vertex in range(self.V):
            if vertex not in visited:
                self.topologicalSortUtil(vertex, visited,stack)
 
        # Print contents of stack
        print(stack)
 
g= Graph(6)
g.addEdge(5, 2);
g.addEdge(5, 0);
g.addEdge(4, 0);
g.addEdge(4, 1);
g.addEdge(2, 3);
g.addEdge(3, 1);
 
print("Following is a Topological Sort of the given graph")
g.topologicalSort()