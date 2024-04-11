net = smile.Network();
net.readFile("test2.xdsl")
net.addNode(4,"LPI_VALVES_INDEP")
net.setNodePosition("LPI_VALVES_INDEP",170,50,80,80)
net.addNode(4,"LPI_PUMPS")
net.setNodePosition("LPI_PUMPS",80,50,80,80)
net.addNode(4,"LPI_VALVES")
net.setNodePosition("LPI_VALVES",140,50,80,80)
net.addNode(4,"LPI_FT")
net.setNodePosition("LPI_FT",50,50,80,80)
net.addNode(4,"LPI_PUMPS_INDEP")
net.setNodePosition("LPI_PUMPS_INDEP",110,50,80,80)
net.addNode(18,"LPI_VALVE_A")
net.setNodePosition("LPI_VALVE_A",200,50,80,80)
net.addNode(18,"LPI_VALVE_B")
net.setNodePosition("LPI_VALVE_B",200,65,80,80)
net.addNode(18,"LPI_VALVE_C")
net.setNodePosition("LPI_VALVE_C",200,80,80,80)
net.addNode(18,"LPI_PUMPS_CCF")
net.setNodePosition("LPI_PUMPS_CCF",200,95,80,80)
net.addNode(18,"LPI_VALVES_CCF")
net.setNodePosition("LPI_VALVES_CCF",200,110,80,80)
net.addNode(18,"TANK")
net.setNodePosition("TANK",200,125,80,80)
net.addNode(18,"LPI_PUMP_A")
net.setNodePosition("LPI_PUMP_A",200,140,80,80)
net.addNode(18,"LPI_PUMP_B")
net.setNodePosition("LPI_PUMP_B",200,155,80,80)
net.addArc(2,1)
net.addArc(8,1)
net.addArc(1,0)
net.addArc(10,0)
net.addArc(3,0)
net.addArc(11,2)
net.addArc(12,2)
net.addArc(5,4)
net.addArc(6,4)
net.addArc(7,4)
net.addArc(9,3)
net.addArc(4,3)
net.setNodeDefinition(LPI_PUMPS_CCF,[null,1-null])net.setNodeDefinition(LPI_PUMPS,[null,1-null])net.setNodeDefinition(LPI_VALVES_CCF,[null,1-null])net.setNodeDefinition(TANK,[null,1-null])net.setNodeDefinition(LPI_FT,[null,1-null])net.setNodeDefinition(LPI_PUMPS_INDEP,[null,1-null])net.setNodeDefinition(LPI_PUMP_A,[null,1-null])net.setNodeDefinition(LPI_VALVES_INDEP,[null,1-null])net.setNodeDefinition(LPI_PUMP_B,[null,1-null])net.setNodeDefinition(LPI_VALVE_C,[null,1-null])net.setNodeDefinition(LPI_VALVE_A,[null,1-null])net.setNodeDefinition(LPI_VALVE_B,[null,1-null])net.setNodeDefinition(LPI_VALVES,[null,1-null])net.writeFile("test2.xdsl")
