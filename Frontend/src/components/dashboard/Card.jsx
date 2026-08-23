const Card = (props) => {
  return (
    <div>
      <div>
        <h2>{props.title}</h2>
        <span>{props.value}</span>
        <p>{props.change}</p>
      </div>
      <div>{props.icon}</div>
    </div>
  );
};

export default Card;
