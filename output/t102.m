net = smile.Network();
net.readFile("t102.xdsl")
net.addNode(18,"LPI_PUMPS_CCF")
net.addNode(18,"LPI_VALVES_CCF")
net.addNode(4,"LPI_PUMPS")
net.addNode(18,"TANK")
net.addNode(4,"LPI_FT")
net.addNode(4,"LPI_PUMPS_INDEP")
net.addNode(18,"LPI_PUMP_A")
net.addNode(18,"LPI_PUMP_B")
net.addNode(4,"LPI_VALVES_INDEP")
net.addNode(18,"LPI_VALVE_C")
net.addNode(18,"LPI_VALVE_A")
net.addNode(18,"LPI_VALVE_B")
net.addNode(4,"LPI_VALVES")
net.addArc(10,11)
net.addArc(10,3)
net.addArc(9,10)
net.addArc(9,8)
net.addArc(9,12)
net.addArc(11,1)
net.addArc(11,2)
net.addArc(13,4)
net.addArc(13,5)
net.addArc(13,6)
net.addArc(12,7)
net.addArc(12,13)
net.setNodeDefinition("LPI_PUMPS_CCF",[ 1.000E-003,1- 1.000E-003])
net.setNodeDefinition("LPI_VALVES_CCF",[ 1.000E-005,1- 1.000E-005])
net.setNodeDefinition("TANK",[ 1.000E-007,1- 1.000E-007])
net.setNodeDefinition("LPI_PUMP_A",[ 2.000E-002,1- 2.000E-002])
net.setNodeDefinition("LPI_PUMP_B",[ 2.000E-002,1- 2.000E-002])
net.setNodeDefinition("LPI_VALVE_C",[ 1.000E-002,1- 1.000E-002])
net.setNodeDefinition("LPI_VALVE_A",[ 1.000E-002,1- 1.000E-002])
net.setNodeDefinition("LPI_VALVE_B",[ 1.000E-002,1- 1.000E-002])
net.writeFile("t102.xdsl")
