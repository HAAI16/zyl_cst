//调试表原始对象
{
        "title":"调试：com.intellij.database.psi.DbTableImpl",
        "methodList":[{
        "name":"isTemporary",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
        "value":"false"
        },{
        "name":"isSystem",
        "desc":"public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
        "value":"false"
        },{
        "name":"getColumnAttrs",
        "desc":"public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
        "value":null
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> test@localhost<br><b>Schema:</b> test<br><b>Table:</b> blog<br><br><code><pre><font color=\"#808080\"><i>-- auto-generated definition</i></font>\n<font color=\"#000080\"><b>create</b></font> <font color=\"#000080\"><b>table</b></font> blog\n(\n  id      <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>not</b></font> <font color=\"#000080\"><b>null</b></font>\n    <font color=\"#000080\"><b>primary</b></font> <font color=\"#000080\"><b>key</b></font>,\n  title   <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  content <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  <font color=\"#000080\"><b>date</b></font>    <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  userId  <font color=\"#000080\"><b>int</b></font>          <font color=\"#000080\"><b>null</b></font>\n);\n\n</pre></code><br><small>Connecting to database...</small>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> test@localhost<br><b>Schema:</b> test<br><b>Table:</b> blog<br><br><code><pre><font color=\"#808080\"><i>-- auto-generated definition</i></font>\n<font color=\"#000080\"><b>create</b></font> <font color=\"#000080\"><b>table</b></font> blog\n(\n  id      <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>not</b></font> <font color=\"#000080\"><b>null</b></font>\n    <font color=\"#000080\"><b>primary</b></font> <font color=\"#000080\"><b>key</b></font>,\n  title   <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  content <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  <font color=\"#000080\"><b>date</b></font>    <font color=\"#000080\"><b>varchar</b></font>(<font color=\"#0000ff\">255</font>) <font color=\"#000080\"><b>null</b></font>,\n  userId  <font color=\"#000080\"><b>int</b></font>          <font color=\"#000080\"><b>null</b></font>\n);\n\n</pre></code><br><small>Connecting to database...</small>"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"blog"
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"table"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:test"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:test"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
        "value":"schema:test"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":null
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"CREATE TABLE blog\n(\n    id varchar(255) PRIMARY KEY NOT NULL,\n    title varchar(255),\n    content varchar(255),\n    date varchar(255),\n    userId int(11)\n)"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=Row icon. myIcons=[jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.png, null]"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"0"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@6cdc3c47"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"table:blog"
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbElementImpl.getWeight()",
        "value":"10000"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"blog: table"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project 'D:\\IDEAProject\\hpu' zyl_cst"
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"table"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: table, test.blog [test@localhost]"
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"false"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@37eac418"
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDisplayOrder",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getDisplayOrder()",
        "value":""
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"schema:test"
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"schema:test"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:test@localhost"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:test@localhost"
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"table:blog"
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.png"
        },{
        "name":"getDependences",
        "desc":"public java.lang.Object[] com.intellij.database.psi.DbElementImpl.getDependences()",
        "value":"[Ljava.lang.Object;@718bd0c5"
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"test (test@localhost)"
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"table:blog"
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"blog"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"schema:test"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"table:blog"
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"table:blog"
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@7c38f4b7"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"createLayeredIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"registerIconLayer",
        "desc":"public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"overlayIcons",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@2410066b, lastComputedIcon={0=Row icon. myIcons=[jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.png, null]}, COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@45bbdcf5}"
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"schema:test"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@6e7fbcf3"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"schema:test"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"blog: table"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"12"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@4d4efa8a"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@63317731"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"com.intellij.util.NullableFunction",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$555/1769537516@526e37a0"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$1@41e5813a"
        },{
        "name":"ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$2@7b45b926"
        },{
        "name":"ourIconLayers",
        "type":"java.util.List",
        "value":"[com.intellij.psi.impl.ElementBase$IconLayer@1325c180, com.intellij.psi.impl.ElementBase$IconLayer@30d53773, com.intellij.psi.impl.ElementBase$IconLayer@5d549c02, com.intellij.psi.impl.ElementBase$IconLayer@b8e8207]"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@2410066b, lastComputedIcon={0=Row icon. myIcons=[jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/table.png, null]}, COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@45bbdcf5}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@361a7b37"
        }]
        }

//调试列原始对象
        {
        "title":"调试：com.intellij.database.psi.DbColumnImpl",
        "methodList":[{
        "name":"getDefault",
        "desc":"public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
        "value":null
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:blog"
        },{
        "name":"getParent",
        "desc":"public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:blog"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:blog"
        },{
        "name":"getParent",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
        "value":"table:blog"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"table:blog"
        },{
        "name":"getTable",
        "desc":"public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
        "value":"table:blog"
        },{
        "name":"getDataType",
        "desc":"public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
        "value":"varchar(255)"
        },{
        "name":"getWeight",
        "desc":"public int com.intellij.database.psi.DbColumnImpl.getWeight()",
        "value":"10030"
        },{
        "name":"isNotNull",
        "desc":"public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
        "value":"true"
        },{
        "name":"getTableName",
        "desc":"public java.lang.String com.intellij.database.psi.DbColumnImpl.getTableName()",
        "value":"blog"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> test@localhost<br><b>Schema:</b> test<br><b>Table:</b> blog<br><b>Column:</b> id<br><br><code><pre>id <font color=\"#000080\"><b>varchar(255)</b></font> <font color=\"#000080\"><b>NOT</b></font> <font color=\"#000080\"><b>NULL</b></font>\n<font color=\"#000080\"><b>PRIMARY</b></font> <font color=\"#000080\"><b>KEY</b></font> (id)</pre></code>"
        },{
        "name":"getDocumentation",
        "desc":"public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation()",
        "value":"<html><body><b>Data Source:</b> test@localhost<br><b>Schema:</b> test<br><b>Table:</b> blog<br><b>Column:</b> id<br><br><code><pre>id <font color=\"#000080\"><b>varchar(255)</b></font> <font color=\"#000080\"><b>NOT</b></font> <font color=\"#000080\"><b>NULL</b></font>\n<font color=\"#000080\"><b>PRIMARY</b></font> <font color=\"#000080\"><b>KEY</b></font> (id)</pre></code>"
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
        "value":"id"
        },{
        "name":"getLanguage",
        "desc":"public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
        "value":"Language: SQL"
        },{
        "name":"getTypeName",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
        "value":"column"
        },{
        "name":"init",
        "desc":"public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"setName",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isDirectory",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
        "value":"false"
        },{
        "name":"getComment",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
        "value":null
        },{
        "name":"isValid",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isValid()",
        "value":"true"
        },{
        "name":"getText",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
        "value":"id varchar(255) NOT NULL"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
        "value":"Deferred. Base=jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.png"
        },{
        "name":"getIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
        "value":null
        },{
        "name":"isWritable",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
        "value":"true"
        },{
        "name":"getPosition",
        "desc":"public short com.intellij.database.psi.DbElementImpl.getPosition()",
        "value":"1"
        },{
        "name":"acceptChildren",
        "desc":"public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getManager",
        "desc":"public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
        "value":"com.intellij.psi.impl.PsiManagerImpl@6cdc3c47"
        },{
        "name":"getDeclaration",
        "desc":"public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
        "value":"column:id"
        },{
        "name":"getDelegate",
        "desc":"public D com.intellij.database.psi.DbElementImpl.getDelegate()",
        "value":"id: column"
        },{
        "name":"getProject",
        "desc":"public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
        "value":"Project 'D:\\IDEAProject\\hpu' zyl_cst"
        },{
        "name":"getKind",
        "desc":"public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
        "value":"column"
        },{
        "name":"getVirtualFile",
        "desc":"public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
        "value":"DB VirtualFile: column, test.blog.id [test@localhost]"
        },{
        "name":"isCaseSensitive",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
        "value":"false"
        },{
        "name":"getChildren",
        "desc":"public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
        "value":"[Lcom.intellij.psi.PsiElement;@37eac418"
        },{
        "name":"processDeclarations",
        "desc":"public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"processChildren",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<com.intellij.psi.PsiFileSystemItem>)",
        "value":null
        },{
        "name":"getDasChildren",
        "desc":"public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
        "value":null
        },{
        "name":"getDisplayOrder",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getDisplayOrder()",
        "value":"00001"
        },{
        "name":"getDasParent",
        "desc":"public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"table:blog"
        },{
        "name":"getDasParent",
        "desc":"public P com.intellij.database.psi.DbElementImpl.getDasParent()",
        "value":"table:blog"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:test@localhost"
        },{
        "name":"getDataSource",
        "desc":"public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
        "value":"root:test@localhost"
        },{
        "name":"navigate",
        "desc":"public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
        "value":null
        },{
        "name":"canNavigate",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
        "value":null
        },{
        "name":"getMetaData",
        "desc":"public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
        "value":"column:id"
        },{
        "name":"canNavigateToSource",
        "desc":"public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
        "value":null
        },{
        "name":"checkSetName",
        "desc":"public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getBaseIcon",
        "desc":"public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
        "value":"jar:file:/D:/Program-Files/IDEA/IntelliJ%20IDEA%202018.2.1/plugins/DatabaseTools/lib/database-openapi.jar!/icons/col.png"
        },{
        "name":"getDependences",
        "desc":"public java.lang.Object[] com.intellij.database.psi.DbElementImpl.getDependences()",
        "value":"[Ljava.lang.Object;@718bd0c5"
        },{
        "name":"getLocationString",
        "desc":"public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
        "value":"test.blog (test@localhost)"
        },{
        "name":"createDeclarationProcessor",
        "desc":"public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"newDeclarationProcessor",
        "desc":"public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getNode",
        "desc":"public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
        "value":null
        },{
        "name":"getTextLength",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
        "value":"0"
        },{
        "name":"getTextOffset",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
        "value":"0"
        },{
        "name":"getFirstChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
        "value":null
        },{
        "name":"getLastChild",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
        "value":null
        },{
        "name":"getNextSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
        "value":null
        },{
        "name":"getIcon",
        "desc":"public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
        "value":null
        },{
        "name":"textToCharArray",
        "desc":"public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
        "value":null
        },{
        "name":"getPresentation",
        "desc":"public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
        "value":"column:id"
        },{
        "name":"getPrevSibling",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
        "value":null
        },{
        "name":"getStartOffsetInParent",
        "desc":"public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
        "value":"0"
        },{
        "name":"getTextRange",
        "desc":"public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
        "value":null
        },{
        "name":"findElementAt",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
        "value":null
        },{
        "name":"isPhysical",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
        "value":"false"
        },{
        "name":"textContains",
        "desc":"public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
        "value":null
        },{
        "name":"getPresentableText",
        "desc":"public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
        "value":"id"
        },{
        "name":"add",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"replace",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkDelete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"delete",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"accept",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
        "value":null
        },{
        "name":"getContext",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
        "value":"table:blog"
        },{
        "name":"copy",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"textMatches",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
        "value":null
        },{
        "name":"findReferenceAt",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
        "value":null
        },{
        "name":"addRangeBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addRangeAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"checkAdd",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"deleteChildRange",
        "desc":"public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"isEquivalentTo",
        "desc":"public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
        "value":null
        },{
        "name":"getReference",
        "desc":"public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
        "value":null
        },{
        "name":"addRange",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addBefore",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"addAfter",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
        "value":null
        },{
        "name":"getNavigationElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
        "value":"column:id"
        },{
        "name":"getOriginalElement",
        "desc":"public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
        "value":"column:id"
        },{
        "name":"getReferences",
        "desc":"public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
        "value":"[Lcom.intellij.psi.PsiReference;@7c38f4b7"
        },{
        "name":"getResolveScope",
        "desc":"public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
        "value":"Project and Libraries"
        },{
        "name":"getUseScope",
        "desc":"public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
        "value":"Project and Libraries"
        },{
        "name":"getContainingFile",
        "desc":"public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
        "value":null
        },{
        "name":"createLayeredIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.createLayeredIcon(com.intellij.openapi.util.Iconable,javax.swing.Icon,int)",
        "value":null
        },{
        "name":"iconWithVisibilityIfNeeded",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"registerIconLayer",
        "desc":"public static void com.intellij.psi.impl.ElementBase.registerIconLayer(int,javax.swing.Icon)",
        "value":null
        },{
        "name":"isNativeFileType",
        "desc":"public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
        "value":null
        },{
        "name":"transformFlags",
        "desc":"public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
        "value":null
        },{
        "name":"overlayIcons",
        "desc":"public static javax.swing.Icon com.intellij.psi.impl.ElementBase.overlayIcons(javax.swing.Icon...)",
        "value":null
        },{
        "name":"buildRowIcon",
        "desc":"public static com.intellij.ui.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
        "value":null
        },{
        "name":"replace",
        "desc":"public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
        "value":null
        },{
        "name":"getUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"getUserDataString",
        "desc":"public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3ee55fcb}"
        },{
        "name":"copyCopyableDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getCopyableUserData",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
        "value":null
        },{
        "name":"putCopyableUserData",
        "desc":"public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"putUserDataIfAbsent",
        "desc":"public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
        "value":null
        },{
        "name":"isUserDataEmpty",
        "desc":"public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
        "value":"false"
        },{
        "name":"copyUserDataTo",
        "desc":"public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
        "value":null
        },{
        "name":"getDbParent",
        "desc":"public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
        "value":"table:blog"
        },{
        "name":"getDbChildren",
        "desc":"public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
        "value":null
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@6e7fbcf3"
        },{
        "name":"WEIGHT_BASE",
        "type":"int",
        "value":"10000"
        },{
        "name":"WEIGHT_INC",
        "type":"int",
        "value":"1000"
        },{
        "name":"myParent",
        "type":"com.intellij.database.psi.DbElement",
        "value":"table:blog"
        },{
        "name":"myDelegate",
        "type":"java.lang.Object",
        "value":"id: column"
        },{
        "name":"myTransactionalVersion",
        "type":"long",
        "value":"12"
        },{
        "name":"ASYNC_DOC_CUT",
        "type":"java.lang.String",
        "value":"<!-- async-doc-cut -->"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@4d4efa8a"
        },{
        "name":"LOG",
        "type":"com.intellij.openapi.diagnostic.Logger",
        "value":"com.intellij.idea.IdeaLogger@63317731"
        },{
        "name":"FLAGS_LOCKED",
        "type":"int",
        "value":"2048"
        },{
        "name":"ICON_COMPUTE",
        "type":"com.intellij.util.NullableFunction",
        "value":"com.intellij.psi.impl.ElementBase$$Lambda$555/1769537516@526e37a0"
        },{
        "name":"VISIBILITY_ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$1@41e5813a"
        },{
        "name":"ICON_PLACEHOLDER",
        "type":"com.intellij.openapi.util.NotNullLazyValue",
        "value":"com.intellij.psi.impl.ElementBase$2@7b45b926"
        },{
        "name":"ourIconLayers",
        "type":"java.util.List",
        "value":"[com.intellij.psi.impl.ElementBase$IconLayer@1325c180, com.intellij.psi.impl.ElementBase$IconLayer@30d53773, com.intellij.psi.impl.ElementBase$IconLayer@5d549c02, com.intellij.psi.impl.ElementBase$IconLayer@b8e8207]"
        },{
        "name":"COPYABLE_USER_MAP_KEY",
        "type":"com.intellij.openapi.util.Key",
        "value":"COPYABLE_USER_MAP_KEY"
        },{
        "name":"myUserMap",
        "type":"com.intellij.util.keyFMap.KeyFMap",
        "value":"{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@3ee55fcb}"
        },{
        "name":"updater",
        "type":"com.intellij.util.concurrency.AtomicFieldUpdater",
        "value":"com.intellij.util.concurrency.AtomicFieldUpdater@361a7b37"
        }]
        }

//调试列原始列类型
        {
        "title":"调试：com.intellij.database.model.DataType",
        "methodList":[{
        "name":"getLength",
        "desc":"public int com.intellij.database.model.DataType.getLength()",
        "value":"255"
        },{
        "name":"getScale",
        "desc":"public int com.intellij.database.model.DataType.getScale()",
        "value":"0"
        },{
        "name":"getPrecision",
        "desc":"public int com.intellij.database.model.DataType.getPrecision()",
        "value":"255"
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification()",
        "value":"varchar(255)"
        },{
        "name":"getSpecification",
        "desc":"public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean)",
        "value":null
        },{
        "name":"equalsWithoutJdbc",
        "desc":"public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
        "value":null
        }],
        "----":"-----------------我是一条华丽的分割线-----------------",
        "fieldList":[{
        "name":"MAX_SIZE",
        "type":"int",
        "value":"2147483647"
        },{
        "name":"STAR_SIZE",
        "type":"int",
        "value":"2147483646"
        },{
        "name":"NO_SIZE",
        "type":"int",
        "value":"-1"
        },{
        "name":"NO_SCALE",
        "type":"int",
        "value":"0"
        },{
        "name":"UNKNOWN",
        "type":"com.intellij.database.model.DataType",
        "value":"unknown"
        },{
        "name":"schemaName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"packageName",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"typeName",
        "type":"java.lang.String",
        "value":"varchar"
        },{
        "name":"size",
        "type":"int",
        "value":"255"
        },{
        "name":"scale",
        "type":"int",
        "value":"0"
        },{
        "name":"sizeUnit",
        "type":"com.intellij.database.model.LengthUnit",
        "value":"com.intellij.database.model.LengthUnit@66da7e23"
        },{
        "name":"vagueArg",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"suffix",
        "type":"java.lang.String",
        "value":null
        },{
        "name":"sizeUnitExplicit",
        "type":"boolean",
        "value":"false"
        },{
        "name":"custom",
        "type":"boolean",
        "value":"false"
        },{
        "name":"enumValues",
        "type":"java.util.List",
        "value":null
        },{
        "name":"jdbcType",
        "type":"int",
        "value":"0"
        }]
        }

//获取原始列类型中的字段
        sqlType=varchar

//执行原始列类型中的方法
        sqlTypeLen=255