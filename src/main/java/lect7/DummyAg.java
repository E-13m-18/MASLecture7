package lect7;

import jade.core.AID;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import jade.domain.AMSService;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.AMSAgentDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAAgentManagement.SearchConstraints;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAException;


public class DummyAg extends Agent {
    private Agent myAgent = this;

    @Override
    protected void setup (){
        super.setup();



//  ЧАСТЬ КОДА ДЛЯ ПРОВЕРКИ AMS   !!!!!!!!!
        addBehaviour(new OneShotBehaviour(){
            @Override
            public void action() {
                AMSAgentDescription[] agents = null;
                try{
                    SearchConstraints sc = new SearchConstraints();
                    sc.setMaxResults(new Long(-1));
                    agents = AMSService.search(myAgent,new AMSAgentDescription(), sc);
                }catch(FIPAException e){
                    e.printStackTrace();
                }

                for(int i=0; i<agents.length;i++){
                    AID  aid = agents[i].getName();
                    System.out.println("found "+aid.getLocalName());
                }
            }
        });
        

        /*
//    ЧАСТЬ КОДА ДЛЯ DF     !!!!!!!!!!!

        addBehaviour(new OneShotBehaviour() {
            @Override
            public void action() {
                DFAgentDescription dfd = new DFAgentDescription();
                ServiceDescription sd = new ServiceDescription();
                sd.setType("book-selling");
                dfd.addServices(sd);
                DFAgentDescription[] foundServices = null;
                try {
                    foundServices = DFService.search(myAgent,dfd);
                } catch (FIPAException e) {
                    e.printStackTrace();
                }

                for (int i=0; i<foundServices.length; i++){
                    System.out.println(foundServices[i].getName().getLocalName());
                }
            }
        });
        */

    }
}
