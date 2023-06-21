package locadora;


public class Locadora {
    public static void main(String[] args) {

        Midia[] midias = new Midia[15];

        Dvd dvd1 = new Dvd("Nada de Novo no Front", "Vídeo", "Drama/Guerra", 8.0, new String[]{"Daniel Brühl, Felix Kammerer, Albrecht Schuch"}, "Edward Berger", 143);
        Dvd dvd2 = new Dvd("Avatar: O Caminho da Água", "Vídeo", "Ficção", 7.0, new String[]{"Sam Worthington, Zoë Saldaña, Sigourney Weaver"}, "James Cameron", 190);
        Dvd dvd3 = new Dvd("Top Gun: Maverick", "Vídeo", "Ação", 3.0, new String[]{"Tom Cruise, Miles Teller, Jennifer Connelly"}, "Joseph Kosinski", 130);
        Dvd dvd4 = new Dvd("Entre Mulheres", "Vídeo", "Drama", 10.0, new String[]{"Claire Foy, Rooney Mara, Jessie Buckley"}, "Sarah Polley", 105);
        Dvd dvd5 = new Dvd("Tudo em Todo o Lugar ao Mesmo Tempo", "Vídeo", "Ficção", 15.0, new String[]{"Michelle Yeoh, Jamie Lee Curtis, Ke Huy Quan"}, "Daniel Kwan", 139);

        Cd cd1 = new Cd("Icarus", "Audio", "Rap", 5.0, "Bk'", 13);
        Cd cd2 = new Cd("2014 Forest Drive Hilss", "Audio", "Rap", 5.0, "J. Cole", 13);
        Cd cd3 = new Cd("good kid, m.A.A.d city", "Audio", "Rap", 9.0, "Kendrick Lamar", 17);
        Cd cd4 = new Cd("Operation: Doomsday", "Audio", "Rap", 15.0, "MF DOOM", 42);
        Cd cd5 = new Cd("The College Dropout", "Audio", "Rap", 7.0, "Kanye West", 21);

        Vhs vhs1 = new Vhs("Um Tira da Pesada", "Vídeo", "Comédia", 7, true);
        Vhs vhs2 = new Vhs("O Mágico de Oz", "Vídeo", "Fantasia/Musical", 7.5, true);
        Vhs vhs3 = new Vhs("Os Caça-Fantasmas", "Vídeo", " Comédia/Fantasia", 10, false);
        Vhs vhs4 = new Vhs("Matilda", "Vídeo", "Infantil", 4.0, false);
        Vhs vhs5 = new Vhs("E o Vento Levou", "Vídeo", "Romance", 15.0, true);

        midias[0] = dvd1;
        midias[1] = dvd2;
        midias[2] = dvd3;
        midias[3] = dvd4;
        midias[4] = dvd5;

        midias[5] = cd1;
        midias[6] = cd2;
        midias[7] = cd3;
        midias[8] = cd4;
        midias[9] = cd5;

        midias[10] = vhs1;
        midias[11] = vhs2;
        midias[12] = vhs3;
        midias[13] = vhs4;
        midias[14] = vhs5;

        //imprimir as informações de um DVD
        Dvd dvdSelecionado = (Dvd) midias[0]; // -> Aqui vc tem que "Selecionar" o dvd 0 - 4
        System.out.println("Informações do DVD selecionado:");
        System.out.println("Nome: " + dvdSelecionado.getNome());
        System.out.println("Tipo: " + dvdSelecionado.getTipo());
        System.out.println("Gênero: " + dvdSelecionado.getGenero());
        System.out.println("Preço: " + dvdSelecionado.getPreco());
        System.out.println("Atores: " + String.join(", ", dvdSelecionado.getAtores()));
        System.out.println("Diretor: " + dvdSelecionado.getDiretor());
        System.out.println("Duração: " + dvdSelecionado.getDuracao() + " minutos");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        //imprimir as informações de um CD
        Cd cdSelecionado = (Cd) midias[5]; // -> Aqui vc tem que "Selecionar" o CD 5 - 9
        System.out.println("Informações do CD selecionado:");
        System.out.println("Nome: " + cdSelecionado.getNome());
        System.out.println("Tipo: " + cdSelecionado.getTipo());
        System.out.println("Gênero: " + cdSelecionado.getGenero());
        System.out.println("Preço: " + cdSelecionado.getPreco());
        System.out.println("Cantor: " + cdSelecionado.getCantor());
        System.out.println("Números de Faixas: " + cdSelecionado.getNumFaixas());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        Vhs vhsSelecionado = (Vhs) midias[10]; // -> Aqui vc tem que "Selecionar" a Fita VHS 10 - 15
        System.out.println("Informações da Fita VHS selecionado:");
        System.out.println("Nome: " + vhsSelecionado.getNome());
        System.out.println("Tipo: " + vhsSelecionado.getTipo());
        System.out.println("Gênero: " + vhsSelecionado.getGenero());
        System.out.println("Preço: " + vhsSelecionado.getPreco());
        System.out.println("Está Rebobindada: " + vhsSelecionado.getEstaRebobinada());

    }
}