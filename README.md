# PivotingDatasetFromPlainGrid
 
This codebase is to aggregate/pivotize dataset from the plain List to a recursive Nodes of N level.

e.g.
Root
 - Node
     - Node
 - Node
     - Node
        - Node
        - Node
        - Node
     - Node
  
============================================================================================

Provided dataset:
![image](https://github.com/saumyadipdas/PivotingDatasetFromPlainGrid/assets/39150957/67fda30e-0093-473b-889a-1f0683e6b2d4)



Expected Result:
RootNode =>
[Node [id=Commodity, value=Commodity, hierarchyLevel=0, netMTM=150.0, tranCount=15, children=
 [Node [id=Commodity_Metals, value=Metals, hierarchyLevel=1, netMTM=120.0, tranCount=12, children= 
  [Node [id=Commodity_Metals_Copper, value=Copper, hierarchyLevel=2, netMTM=120.0, tranCount=12, children=
   [
    Node [id=Commodity_Metals_Copper_COM Future, value=COM Future, hierarchyLevel=3, netMTM=30, tranCount=3, children=null], 
    Node [id=Commodity_Metals_Copper_COM Option on Future, value=COM Option on Future, hierarchyLevel=3, netMTM=40, tranCount=4, children=null], 
    Node [id=Commodity_Metals_Copper_COM Future, value=COM Future, hierarchyLevel=3, netMTM=50, tranCount=5, children=null]
   ]]]], 
 Node [id=Commodity_Agriculture, value=Agriculture, hierarchyLevel=1, netMTM=30.0, tranCount=3, children=
  [Node  [id=Commodity_Agriculture_Cattle, value=Cattle, hierarchyLevel=2, netMTM=10.0, tranCount=1, children=
   [
    Node [id=Commodity_Agriculture_Cattle_COM Future, value=COM Future, hierarchyLevel=3, netMTM=10, tranCount=1, children=null]]], 
    Node [id=Commodity_Agriculture_Cocoa, value=Cocoa, hierarchyLevel=2, netMTM=20.0, tranCount=2, children=
     [
      Node [id=Commodity_Agriculture_Cocoa_COM Future, value=COM Future, hierarchyLevel=3, netMTM=20, tranCount=2, children=null]]]]
   ]
  ]
], 

Node [id=Interest Rate, value=Interest Rate, hierarchyLevel=0, netMTM=60.0, tranCount=6, children=[Node [id=Interest Rate_Basis_AUD BBSW 3M, value=Basis_AUD BBSW 3M, hierarchyLevel=1, netMTM=60.0, tranCount=6, children=
 [Node [id=Interest Rate_Basis_AUD BBSW 3M_Inf, value=Inf, hierarchyLevel=2, netMTM=60.0, tranCount=6, children=
  [Node [id=Interest Rate_Basis_AUD BBSW 3M_Inf_IRS Vanilla, value=IRS Vanilla, hierarchyLevel=3, netMTM=60, tranCount=6, children=null]]]]]]
 ]
]



My StackOverFlow query: https://stackoverflow.com/questions/76709224/how-to-create-nested-nodes-objects-from-a-plain-arraylist-in-java
