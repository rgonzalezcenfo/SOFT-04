import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> materiales;
    private ArrayList<Usuario> usuarios;

    //construtor
    public Biblioteca(){
        materiales = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void registarMaterial(Material material){
        materiales.add(material);
    }

    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public Material buscarMaterial(String id){
        Material materialEncontrado = null;
        for (Material material : materiales){
            if (material.getId().equals(id)){
                materialEncontrado = material;
            }
        }
        return materialEncontrado;
    }

    public Usuario buscarUsuario(int id){
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios){
            if (usuario.getId() == (id)){
                usuarioEncontrado = usuario;
            }
        }
        return usuarioEncontrado;
    }

    public void prestarMaterial(int usuarioId, String materialId) throws MaterialNoDisponibleException, UsuarioNoEncontradoException, MaximoPrestamosException, MaterialNoExisteException {
        boolean usuarioEncontrado = false;
        boolean materialEncontrado = false;
        Material materialAPrestar = null;
        for (Material material : materiales){
            if (material.getId().equals(materialId)){
                materialAPrestar = material;
                materialEncontrado = true;
            }
        }

        for (Usuario usuario : usuarios){
            if (usuarioId == usuario.getId()){
                usuarioEncontrado = true;
                usuario.prestarMaterial(materialAPrestar);
            }
        }

        if (!materialEncontrado){
            throw new MaterialNoExisteException("La Biblioteca no posee este material");
        }

        if (!usuarioEncontrado){
            throw new UsuarioNoEncontradoException("Usuario no encontrado");
        }
    }

    public void devolverMaterial(int usuarioId, String materialId) throws UsuarioNoEncontradoException, MaterialNoExisteException {
        boolean usuarioEncontrado = false;
        boolean materialEncontrado = false;
        Material materialADevolver = null;

        for (Material material : materiales){
            if (material.getId().equals(materialId)) {
                materialEncontrado = true;
                materialADevolver = material;

            }
        }
        for (Usuario usuario : usuarios){
            if (usuarioId == usuario.getId()){
                usuarioEncontrado = true;
                usuario.devolverMaterial(materialADevolver);
            }
        }

        if (!materialEncontrado){
            throw new MaterialNoExisteException("La Biblioteca no posee este material");
        }


        if (!usuarioEncontrado){
            throw new UsuarioNoEncontradoException("Usuario no encontrado");
        }
    }

}
