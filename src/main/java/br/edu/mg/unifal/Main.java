package br.edu.mg.unifal;

import br.edu.mg.unifal.factory.UserAssembler;
import br.edu.mg.unifal.service.UserService;

public class Main {

    public static void main(String[] args) {
        UserService service = new UserService();
        System.out.println(service.isMale.test(UserAssembler.assemble().get(0)));
        System.out.println(service.isPreferNotSay.test(UserAssembler.assemble().get(1)));
        service.printUser.accept(UserAssembler.assemble().get(8));
        service.getUUID.get();
        System.out.println(service.getDate.get());
        System.out.println(service.getUserAge.apply(UserAssembler.assemble().get(8)));
    }

}
