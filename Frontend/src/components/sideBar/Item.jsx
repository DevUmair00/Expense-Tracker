import { Link} from "react-router-dom";

const Item = ({ title, path, icon }) => {
  const Icon = icon;

  return (
    <Link to={path}>
      <div className="flex gap-2 p-3 ">
        <Icon className="size-6 text-black/70 font-bold" />
        <h2 className="font-medium text-black/50">{title}</h2>
      </div>
    </Link>
  );
};

export default Item;
