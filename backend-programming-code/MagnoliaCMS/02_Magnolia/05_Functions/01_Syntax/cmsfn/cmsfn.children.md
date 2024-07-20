[#assign portalParticipatePage = cmsfn.contentByPath("/portal-participate", "website")!]
<ul>
    [#list cmsfn.children(portalParticipatePage, "mgnl:page") as childNode]
        <li><a href="${cmsfn.link(childNode)!}">${childNode.title!childNode.@name}</a></li>
    [/#list]
</ul>

<!-- 
    Este código en FreeMarker está utilizando la función cmsfn.children(targetNode, "mgnl:page") para obtener los hijos del nodo targetNode que son de tipo "mgnl:page". 
    Luego, utiliza la directiva <#list> para iterar sobre estos hijos y generar una lista HTML (<ul>) de enlaces. 
-->
<ul>
  [#list cmsfn.children(targetNode, "mgnl:page") as childNode]
    <li><a href="${cmsfn.link(childNode)!}">${childNode.title!childNode.@name}</a></li>
  [/#list]
</ul>

<!-- 
  Este código maneja la posibilidad de que la colección devuelta por javaClass.getSomeCollection() esté vacía.
  La directiva <#list> permite el uso de la cláusula [/#else], que se ejecuta cuando la colección está vacía.
-->
[#list cmsfn.children(targetNode, "mgnl:page")]
  <ul>
    [#items as childNode]
      <li><a href="${cmsfn.link(childNode)!}">${childNode.title!childNode.@name}</a></li>
    [/#items]
  </ul>
[#else]
  // On empty collection
[/#list]

<!-- Recorriendo la Jerarquía de JCR - Obtener Hijos -->
<ul>
  [#list cmsfn.children(paginaPrincipal) as child]
    <li><a href="${cmsfn.link(child)!}">${child.title!child.@name}</a></li>
  [/#list]
</ul>

<!-- Crear enlaces a nodos directamente desde el nodo -->
[#list cmsfn.children(paginaPrincipal) as child]
  <p>Enlace a la imagen del hijo: ${cmsfn.link(child.image)!}</p>
[/#list]