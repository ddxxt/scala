class Graph {
  class Node{
   var  connectedNodes:List[Graph#Node]=Nil
   def connectTo(node: Graph#Node){
     if(connectedNodes.find(node.equals).isEmpty){
         connectedNodes=node::connectedNodes
     }
   }
  }
  var nodes:List[Node]=Nil
  def newNode:Node={
    val res=new Node
    nodes=res::nodes
    res
  }
}

object  Graph{
  def main(args: Array[String]): Unit = {
    val graph1:Graph=new Graph
    val graph2:Graph=new Graph
    val node1:graph1.Node=graph1.newNode
    val node2:graph2.Node=graph2.newNode
    val node3:graph1.Node=graph1.newNode
     node1.connectTo(node2)

  }
}