
    package estudos.gof;

    import estudos.gof.facade.Facade;
    import estudos.gof.singleton.SingletonEager;
    import estudos.gof.singleton.SingletonLazy;
    import estudos.gof.singleton.SingletonLazyHolder;
    import estudos.gof.strategy.Comportamento;
    import estudos.gof.strategy.ComportamentoAgressivo;
    import estudos.gof.strategy.ComportamentoDefensivo;
    import estudos.gof.strategy.ComportamentoNormal;
    import estudos.gof.strategy.Robo;
    
    
    public class Test {
        public static void main(String[] args) {
            
            // Singleton
            
            SingletonLazy lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);
            lazy = SingletonLazy.getInstancia();
            System.out.println(lazy);
            
            SingletonEager eager = SingletonEager.getInstancia();
            System.out.println(eager);
            eager = SingletonEager.getInstancia();
            System.out.println(eager);
            
            SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);
            lazyHolder = SingletonLazyHolder.getInstancia();
            System.out.println(lazyHolder);
            
            // Strategy
            
            Comportamento defensivo = new ComportamentoDefensivo();
            Comportamento normal = new ComportamentoNormal();
            Comportamento agressivo = new ComportamentoAgressivo();
            
            Robo robo = new Robo();
            robo.setComportamento(normal);
            robo.mover();
            robo.mover();
            robo.setComportamento(defensivo);
            robo.mover();
            robo.setComportamento(agressivo);
            robo.mover();
            robo.mover();
            robo.mover();
            
            // Facade
            
            Facade facade = new Facade();
            facade.migrarCliente("Renata", "050820022");
        }
    
    }   

