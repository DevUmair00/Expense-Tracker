const Card = (props) => {

  const Icon = props.icon;

  return (
    <div className="border-2 border-black/20 bg-white rounded-xl grid grid-cols-[2fr_1fr] gap-2 p-4 pr-6">
      <div className="">
        <h2 className="font-medium text-black/50">{props.title}</h2>
        <span className="text-black font-bold text-2xl">{props.value}</span>
        <p className="font-medium text-black/50">{props.change}</p>
      </div>
      <div className="flex items-center justify-center px-4 font-medium  text-6xl  rounded-2xl backdrop-blur-2xl bg-black/10"><Icon className="size-12" /></div>
    </div>
  );
};

export default Card;


