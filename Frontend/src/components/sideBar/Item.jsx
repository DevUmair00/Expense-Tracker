const Item = ({ title, path, icon }) => {

  const Icon = icon;

  return (
    <a href={path}>
      <div className="flex gap-2 p-3 ">
        <Icon className="size-6"/>
        <h2 className="font-medium text-black/50">{title}</h2>
      </div>
    </a>
  );
};  

export default Item;
