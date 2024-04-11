net = smile.Network();
net.readFile("123.xdsl")
net.addNode(18,"LPI_PUMP_A")
net.addNode(18,"LPI_PUMP_B")
net.addNode(4,"LPI_VALVES_INDEP")
net.addNode(18,"LPI_VALVE_C")
net.addNode(18,"LPI_PUMPS_CCF")
net.addNode(18,"LPI_VALVE_A")
net.addNode(18,"LPI_VALVE_B")
net.addNode(18,"LPI_VALVES_CCF")
net.addNode(4,"LPI_PUMPS")
net.addNode(4,"LPI_VALVES")
net.addNode(4,"LPI_FT")
net.addNode(4,"LPI_PUMPS_INDEP")
net.addArc(4,12)
net.addArc(5,12)
net.addArc(6,12)
net.addArc(10,9)
net.addArc(3,9)
net.addArc(7,11)
net.addArc(12,11)
net.addArc(9,8)
net.addArc(-1,8)
net.addArc(11,8)
net.addArc(1,10)
net.addArc(2,10)
net.setNodeDefinition("LPI_PUMP_A",[ 2.000E-002,1- 2.000E-002])
net.setNodeDefinition("LPI_PUMP_B",[ 2.000E-002,1- 2.000E-002])
net.setNodeDefinition("LPI_VALVES_INDEP",[null,1-null])
net.setNodeDefinition("LPI_VALVE_C",[ 1.000E-002,1- 1.000E-002])
net.setNodeDefinition("LPI_PUMPS_CCF",[ 1.000E-003,1- 1.000E-003])
net.setNodeDefinition("LPI_VALVE_A",[ 1.000E-002,1- 1.000E-002])
net.setNodeDefinition("LPI_VALVE_B",[ 1.000E-002,1- 1.000E-002])
net.setNodeDefinition("LPI_VALVES_CCF",[ 1.000E-005,1- 1.000E-005])
net.setNodeDefinition("LPI_PUMPS",[null,1-null])
net.setNodeDefinition("LPI_VALVES",[null,1-null])
net.setNodeDefinition("LPI_FT",[null,1-null])
net.setNodeDefinition("LPI_PUMPS_INDEP",[null,1-null])
net.writeFile("123.xdsl")
