package lect7;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;

public class BlankAg extends Agent {
//дальнейший код необходим для проверки DF !!!!!!!!!!!
//ДЛЯ ПРОВЕРКИ AMS ВЕСЬ КОД КОММЕНТИТСЯ !!!!!!!!!



    /*
    private Agent myAgent;

    @Override
    protected void setup() {
        myAgent = this;
        System.out.println("I'm here");
        super.setup();

        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                registerAgent();
            }

            private void registerAgent(){
                DFAgentDescription dfd = new DFAgentDescription();
                dfd.setName(myAgent.getAID());
                ServiceDescription sd = new ServiceDescription();
                sd.setType("book-selling");
                sd.setName(myAgent.getLocalName()+"-book-seller");
                dfd.addServices(sd);
            try {
                DFService.register(myAgent,dfd);
            } catch (FIPAException e) {
                e.printStackTrace();
            }
            }
        });
    }
    */
}
